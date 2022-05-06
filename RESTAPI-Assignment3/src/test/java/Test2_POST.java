import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class Test2_POST {

	@Test
	public void test_1_POST() {
		
		Map<String, Object> map = new HashMap<String,Object>();

	     map.put("title", "Darsh");     
	     map.put( "dueDate","2022-05-21T11:05:34.438Z");
	     
	     System.out.println(map);  
		 
	    // JSONObject request = new JSONObject();
	
          //request.put("title","Activity 31");
        //  request.put("dueDate","2022-05-22T16:29:50.9490478+00:00");
          
         // System.out.println(request);
         // System.out.println(request. toJSONString());
          
          given().
          header("Content-Type","application/json").
          contentType(ContentType.JSON).
          accept(ContentType.JSON).
          
          
         // body(request.toJSONString()).
           when().
           post("https://fakerestapi.azurewebsites.net/api/v1/Activities").
           then().
              statusCode(201);
	}
	
     
}


