package crudOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetSingleProjectTest {
@Test
public void getSingleProjectTest() {
	Response response = RestAssured.get("http://localhost:8084/projects/TY_PROJ_1012");
  ValidatableResponse valResp = response.then();
  valResp.assertThat().contentType(ContentType.JSON);
  valResp.assertThat().statusCode(200);  
  valResp.log().all();
}
}
