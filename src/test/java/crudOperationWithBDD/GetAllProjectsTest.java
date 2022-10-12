package crudOperationWithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllProjectsTest {
@Test
public void getallprojectTest() {
	baseURI="http://localhost";
	port=8084;
	when()
	      .get("/projects")
	.then()
	      .assertThat()
	             .contentType(ContentType.JSON)
	             .statusCode(200)
	             .log().all();
	
}
}
