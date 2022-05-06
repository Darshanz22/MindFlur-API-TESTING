import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test2GET {
	
	@Test
	public  void test2() {
		given().
		get("https://restful-booker.herokuapp.com/{resourcePath}/{bookingId}", "booking",10).
		then().
		  statusCode(200).
		  //body("bookingid[0]", equalTo(6)).
		log().all();
		 // body("data.title", hasItems("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
	}

}
