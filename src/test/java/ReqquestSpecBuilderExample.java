import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqquestSpecBuilderExample {
    RequestSpecification requestSpecification;
    @BeforeClass
    public void Setup(){
        RequestSpecBuilder builder=new RequestSpecBuilder();
        builder.addHeader("accept","text/html,application/xhtml+xml,application/xml;");
        builder.addParam("page","2");
        requestSpecification= builder.build();

    }
    @Test
    public void testRequest(){
        given().spec(requestSpecification)
                .when()
                .get("https://reqres.in/api/users")
                .then().statusCode(200)
                .log().all();

    }
}
