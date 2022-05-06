import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;
public class Test1_PUT {
	
	@Test
			public void test_1_PUT() {
				
			Map<String, Object> map = new HashMap<String,Object>();
			 map.put("id", "33");  
			 map.put("title", "Darshn");     
		     map.put( "dueDate","2022-04-21T11:05:34.438Z");
		     map.put( "completed","true");
			     System.out.println(map);  
			    // JSONObject request = new JSONObject();
			
		          //request.put("name","Raghav");
		         // request.put("job", "Teacher");
		          
		          //System.out.println(request);
		         // System.out.println(request. toJSONString());
		          
		          given().
		          header("Content-Type","application/json").
		          contentType(ContentType.JSON).
		          accept(ContentType.JSON).
		          
		          
		          //body(request.toJSONString()).
		           when().
		           put("https://fakerestapi.azurewebsites.net/api/v1/Activities").
		           then().
		              statusCode(200).
		              log().all();
			}

}
