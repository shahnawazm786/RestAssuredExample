import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.lessThan;

public class TimeMeasurementExample {
    @Test
    public void testResponseTime(){
        long t= given()
                .get("http://jsonplaceholder.typicode.com/photos/")
                .time();
        System.out.println("Time taken to execute (time's) -> "+t);

    }
    @Test
    public void testResponseTimeInUnit(){
        long t= given()
                .get("http://jsonplaceholder.typicode.com/photos/1")
                .timeIn(TimeUnit.MILLISECONDS);
        System.out.println("Time taken to execute in milli second ->"+t);
        Assert.assertTrue(t<1000 || t>2000);
    }
    @Test
    public void testResponseTimeAssertion(){
        given().get("http://jsonplaceholder.typicode.com/photos/1")
                .then()
                .time(lessThan(2000L));
    }
}
