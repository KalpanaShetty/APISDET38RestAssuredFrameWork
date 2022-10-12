package crudOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProject {
@Test
public void addProjectTest() {
	//jason body
			JSONObject obj = new JSONObject();
			obj.put("createdBy", "Kalpana_Shetty");
			obj.put("projectName", "FirmCA18");
			obj.put("status", "created");
			obj.put("teamSize", 5);
			
			//preconditions(body and content type)
			RequestSpecification reqSpec = RestAssured.given();
			reqSpec.body(obj);
			reqSpec.contentType(ContentType.JSON);
			
			
			//action
			Response response = 
					reqSpec.post("http://localhost:8084/addProject");
			//validation
			ValidatableResponse validate = response.then();
		validate.assertThat().contentType(ContentType.JSON);
			validate.assertThat().statusCode(201); 
			validate.log().all();}
}
