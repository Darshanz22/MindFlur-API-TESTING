import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test1_GET {
	


	@Test
	public void test1() {
		
		Response response = get("https://restful-booker.herokuapp.com/");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
		
	

	}
	@Test
	void test2() {
		given()
		   .get("https://restful-booker.herokuapp.com/")
		.then()
		  .statusCode(200);
		  //.log().all()
		  //body("userId.Id[0]", equalTo(1));
	}


}
