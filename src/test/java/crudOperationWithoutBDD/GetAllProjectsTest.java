package crudOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjectsTest {
@Test
public void getAllProject() {
	Response response = RestAssured.get("http://localhost:8084/projects");

System.out.println(response.getContentType());
ValidatableResponse validate = response.then();
validate.assertThat().contentType(ContentType.JSON);
validate.log().all();

//response.prettyPrint();
//response.prettyPeek();
}
}
