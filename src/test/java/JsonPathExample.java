
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import java.util.*;
import static io.restassured.path.json.JsonPath.*;
public class JsonPathExample {
@Test
    public void testJsonPath(){
    String responseAsString=
            when().get("http://jsonplaceholder.typicode.com/photos")
            .then()
            .extract().asString();
    List<Integer> albumId=from(responseAsString).get("id");
    System.out.println("Size of album is - >"+albumId.size());
}
@Test
    public void testJsonPath2(){
    String json= when().get("http://jsonplaceholder.typicode.com/photos")
            .then()
            .extract().asString();
    JsonPath jsonPath=new JsonPath(json).setRootPath("RestResponse.result");
    // JsonPath jsonPath=new JsonPath(json).setRootPath("");
    // JsonPath jsonPath=new JsonPath(json);//.setRootPath("RestResponse.result");
    List<String> list=jsonPath.get("name");
    System.out.println("Total size is ->  "+ list.size());
}
}
