package differentWaysToPostTheRequest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequestUsingJsonFileTest {
@Test
public void  createPostTest() {
	File file= new File("./src/test/resources/testData.json");
	given().
	      contentType(ContentType.JSON)
	      .body(file)
	  .when()
	  .post("http://localhost:8084/addProject")
	  .then()
	  .assertThat()
	  .contentType(ContentType.JSON)
	  .and()
	  .statusCode(201).log().all();
	
}

}
