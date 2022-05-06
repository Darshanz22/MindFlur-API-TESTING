import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class GET {
	
	@Test
	public  void test1() {
		given().
		get("https://restful-booker.herokuapp.com/booking").
		then().
		  statusCode(200).
		  //body("data.userId[1]", equalTo(0)).
		log().all();
		 // body("data.title", hasItems("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
	}

}
