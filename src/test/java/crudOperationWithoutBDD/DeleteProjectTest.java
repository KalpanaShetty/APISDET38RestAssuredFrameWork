package crudOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteProjectTest {
@Test
public void deleteProjectTest() {
	Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1013");
   ValidatableResponse valResp = resp.then();
   valResp.assertThat().statusCode(204);
   valResp.log().all();

}
}
