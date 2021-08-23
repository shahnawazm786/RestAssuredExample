import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.is;

public class SettingRootExample {
    @Test
    public void testWithoutRoot(){
        given().
                get("https://reqres.in/api/users")
                .then()
                .body("",is(""));

    }
}
