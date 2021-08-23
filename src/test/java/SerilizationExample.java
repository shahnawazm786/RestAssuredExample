import io.restassured.mapper.ObjectMapperType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class SerilizationExample {
    @Test
    public void testSerializationUsingHashMap(){
        // Java Object as Map
        Map<String,String> inputJson=new HashMap<>();
        inputJson.put("firstname","Mohammad");
        inputJson.put("lastname","Shahnawaz");
        inputJson.put("Age","35");

        // Assured Implementation
        given().contentType("application/json")
                .body(inputJson)
                .when()
                .post("http://www.thomas-bayer.com/restnames/countries.groovy")
                .then()
                .statusCode(200);

    }
    @Test
    public void testSerialiazationUsingObject(){
        // POJO
        ZebraRequestClassNew obj=new ZebraRequestClassNew();
        obj.setAge(35);
        obj.setWeight(73);
        obj.setHome("Delhi");

        // Rest assured
        given().contentType("application/json")
                .body(obj)
                .when()
                .post("http://www.thomas-bayer.com/restnames/countries.groovy")
                .then()
                .statusCode(200)
                .contentType("application/xml")
                .log()
                .all();
    }
    /*
            Serialization can also be done using explicit serializer
            Here we are converting java object into json using jackson2

     */

    @Test
    public void testSerializationUSingExplicitSerializer(){
        // POJO
        ZebraRequestClassNew obj=new ZebraRequestClassNew();
        obj.setAge(35);
        obj.setWeight(73);
        obj.setHome("Delhi");

        // Rest Assured
        given().body(obj, ObjectMapperType.JACKSON_2)
                .when()
                .post("http://www.thomas-bayer.com/restnames/countries.groovy")
                .then()
                .statusCode(200)
                .contentType("application/xml")
                .log().all();
    }
    @Test
    public void testDeserializationUsingContentType(){

        // POJO
        ZebraRequestClassNew obj=new ZebraRequestClassNew();
        obj.setHome("India");
        obj.setAge(30);
        obj.setWeight(65);

        ZebraResponseClass zebraResponseClass=given()
                .body(obj)
                .when()
                .post("http://www.thomas-bayer.com/restnames/countries.groovy")
                .as(ZebraResponseClass.class);
        // some assertion on response
        zebraResponseClass.setRegId(1101);
        Assert.assertTrue(zebraResponseClass.getRegId()>0); // new registration always be > 0
    }
}
