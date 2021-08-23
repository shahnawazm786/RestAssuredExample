import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class BasicAndDigestiveAuthenticationExample {

    @Test
    public void testBasicChallengedAuthentication(){
        given()
                .auth()
                .basic("username","password")
                .when()
                .get("http://services.groupkt.com/country/get/all")
                .then()
                .statusCode(200);
    }
    @Test
    public void testBasicPreemptiveAuthentication(){
        given()
                .auth()
                .preemptive()
                .basic("username","password")
                .when()
                .get("http://services.groupkt.com/country/get/all")
                .then()
                .statusCode(200);

    }
    @Test
    public void testBasicAuthentication(){
        authentication=basic("username","password");
        given().get("http://services.groupkt.com/country/get/all").then().statusCode(200);
    }
    @Test
    public void testDigestiveAuthentication(){
        given().auth().digest("username","password")
                .when()
                .get("http://services.groupkt.com/country/get/all")
                .then()
                .statusCode(200);
    }

}
