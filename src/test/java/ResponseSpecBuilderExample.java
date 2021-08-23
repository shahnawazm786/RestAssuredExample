import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.lessThan;

public class ResponseSpecBuilderExample {
    ResponseSpecification resSpecification;
    @BeforeClass
    public void Setup()
    {
        ResponseSpecBuilder builder=new ResponseSpecBuilder();
        builder.expectStatusCode(200);
        builder.expectHeader("Content-Type","text/html; charset=ISO-8859-1");
        builder.expectHeader("Cache-Control","private, max-age=0");
        resSpecification= builder.build();
    }
    @Test
    public void testResponse(){
        when()
                .get("https://www.google.com")
                .then()
                .spec(resSpecification)
                .time(lessThan(4000L));
    }
}
