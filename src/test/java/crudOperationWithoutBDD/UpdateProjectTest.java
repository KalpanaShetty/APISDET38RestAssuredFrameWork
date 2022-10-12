package crudOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
@Test
public void updateProjectTest() {
	JSONObject js= new JSONObject();
	js.put("createdBy", "Kalpana_Shetty");
	js.put("projectName", "TY-Miko-1");
	js.put("status", "Completed");
	js.put("teamSize", 10);
	
	RequestSpecification reqSpe = RestAssured.given();
	reqSpe.body(js);
	reqSpe.contentType(ContentType.JSON);
	
	Response response = reqSpe.put("http://localhost:8084/projects/TY_PROJ_1624");
	String ct = response.getContentType();
	System.out.println(ct);
	ValidatableResponse valRes = response.then();
	valRes.assertThat().contentType(ContentType.JSON);
	valRes.assertThat().statusCode(200);
	valRes.log().all();
	
}
}
