import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class Test1_POST {

	@Test
	public void test_1_POST() {
		 
	     JSONObject request = new JSONObject();
	
          request.put("firstname","Darshan");
          request.put("lastname", "Zore");
          
          System.out.println(request);
          System.out.println(request. toJSONString());
          
          given().
          header("Content-Type","application/json").
          contentType(ContentType.JSON).
          accept(ContentType.JSON).
          
          
          body(request.toJSONString()).
           when().
           post("https://restful-booker.herokuapp.com/booking").
           then().
              statusCode(201);
	}
	
     
}


