import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.UnknownHostException;

import static io.restassured.RestAssured.given;

public class HandlingSSL_TLS {
@BeforeClass
public void setup(){
    RestAssured.useRelaxedHTTPSValidation();
}
@Test
    public void TestSSL(){
    given().get("https://www.bupa.com.au/")
            .then()
            .statusCode(200);
    // SSLPeerUnverifiedException



}

// If we are not initiation RestAssured.useRelaxedHTTPSValidation(); method in BeforeClass then
// we need to use following code to avoid to certificate exceptions
@Test
public void TestSSL1(){
    given().relaxedHTTPSValidation()
            .when()
            .get("https://www.bupa.com.au/")
            .then()
            .statusCode(200);

}
// We can verify the TLS certificate by overloading this method -> relaxedHTTPSValidation()
//relaxedHTTPSValidation("TLS")
@Test
public void TestTLS() throws UnknownHostException {
        given().relaxedHTTPSValidation("TLS")
                .when()
                .get("https://services.groupkt.com/country/get/iso3code/ita")
                .then()
                .statusCode(200);

}
}
