import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class BearerTokenAuthenticationExample {
@Test
    public void bearerTokenAuthenticationTest(){
    RestAssured.baseURI="http://bookstore.toolsqa.com";
    RequestSpecification request=RestAssured.given();
    
}
}
