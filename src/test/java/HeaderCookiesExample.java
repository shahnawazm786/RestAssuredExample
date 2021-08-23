import static io.restassured.RestAssured.*;

import groovy.util.MapEntry;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.*;
public class HeaderCookiesExample {
    @Test
    public void testCookies(){
        Response response=get("https://www.google.com");
        Map<String,String> cookies=response.getCookies();
        System.out.println("Number of cookies " + cookies.size());
        for(Map.Entry<String,String> cookes: cookies.entrySet()){
            System.out.println("Cookie Key --->  "+cookes.getKey());
            System.out.println("Cookie Value --->" + cookes.getValue());
        }
    }
    @Test
    public void testDetailsCookies(){
        Response response=get("https://www.google.com");
        Cookie ck=response.getDetailedCookie("1P_JAR");
        System.out.println("Domain -->"+ck.getDomain());
        System.out.println("Expire date -->"+ck.getExpiryDate());
        System.out.println("Has Value -->"+ck.hasValue());
        System.out.println("Has expire -->"+ck.hasExpiryDate());
    }


    @Test
    public void testResponseHeader(){
        Response response=get("http://jsonplaceholder.typicode.com/photos");
        String cfrayHeader=response.getHeader("CF-RAY");
        System.out.println("Response header -> "+cfrayHeader);
        System.out.println("------------------Get all header----------------------");
        Headers headers=response.getHeaders();
        for(Header h : headers){
            System.out.println("Header name ---> "+ h.getName());
            System.out.println("Header Value --->" + h.getValue());

        }
    }
}

