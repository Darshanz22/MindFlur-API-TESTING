import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test3_GET{
	
	@Test
	public  void test1() {
		given().
		get("https://httpbin.org/get").
		then().
		  statusCode(200).
		  //body("data.userId[1]", equalTo(0)).
		log().all();
		 // body("data.title", hasItems("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
	}

}
