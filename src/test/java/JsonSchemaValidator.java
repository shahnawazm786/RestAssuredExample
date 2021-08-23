import org.testng.annotations.Test;
import static  io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JsonSchemaValidator {
@Test
public void testJsonSchema(){
    int id=1;
    given().pathParam("id",id)
            .when()
            .get("https://reqres.in/api/users/{id}")
            .then()
            .assertThat()
            .body(matchesJsonSchemaInClasspath("testschema.json"));

}
}
