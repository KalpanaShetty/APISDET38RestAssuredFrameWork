package differentWaysToPostTheRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequestUsingHashMapTest {
@Test
public void createProjectHashMApTest() {
	HashMap hp = new HashMap();
	hp.put("createdBy", "Kalpana");
	hp.put("projectName", "anything-11");
	hp.put("status", "Created");
	hp.put("teamSize", 10);
	baseURI = "http://localhost";
	port = 8084;
	given()
	.body(hp)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.assertThat().statusCode(201)
	.and()
	.assertThat().contentType(ContentType.JSON)
	.log().all();
	
	
	}
}
