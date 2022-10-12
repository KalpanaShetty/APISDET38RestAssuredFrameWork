package crudOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class AddProjectTest {
@Test
public void createProjectTest() {
	JSONObject jobj= new JSONObject();
	jobj.put("createdBy", "Kalpana");
	jobj.put("projectName", "anytghinbg-1");
	jobj.put("status", "Created");
	jobj.put("teamSize", 10);
	baseURI = "http://localhost";
	port = 8084;
	
	
 given()
	     .body(jobj)
	     .contentType(ContentType.JSON)
.when()
        .post("/addProject")
	//String sline = res.getStatusLine();
	//System.out.println(sline);
   .then()
         .assertThat()
             .contentType(ContentType.JSON).log().all();
   
   
   
	
}
}
