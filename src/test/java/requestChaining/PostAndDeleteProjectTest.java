package requestChaining;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.genericUtility.AddProjectPOJOTest;

import static io.restassured.RestAssured.*;

public class PostAndDeleteProjectTest {
@Test
public void postAndDelteTest() {
	baseURI = "http://localhost";
	port = 8084;
	AddProjectPOJOTest pojo=new AddProjectPOJOTest("K-s", "chandayan-1", "created", 512);
	Response response = given()
	.body(pojo)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject");
	String proId = response.jsonPath().get("projectId");
	given()
	.pathParam("projectId", proId)
	.when()
	.delete("projects/{projectId}")
	.then()
	.log()
	.all();
	
}
}
