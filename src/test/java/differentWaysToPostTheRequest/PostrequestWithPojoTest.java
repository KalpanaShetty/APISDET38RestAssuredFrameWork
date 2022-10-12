package differentWaysToPostTheRequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClass.genericUtility.AddProjectPOJOTest;

public class PostrequestWithPojoTest {
@Test
public void createProjectTest() {
	AddProjectPOJOTest pj= new AddProjectPOJOTest("Kalpana", "rmgtyss3", "Created", 5);
	given()
	.contentType(ContentType.JSON)
	.body(pj)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.assertThat().contentType(ContentType.JSON)
	.and()
	.assertThat().statusCode(201)
	.log().all();
}
}
