import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test_GET1 {
	
	@Test
	public  void tesget1() {
		given().
		get("https://fakerestapi.azurewebsites.net/api/v1/Activities/{id}",1).
		then().
		  statusCode(200).
		  //body("bookingid[0]", equalTo(6)).
		log().all();
		 // body("data.title", hasItems("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
	}

}
