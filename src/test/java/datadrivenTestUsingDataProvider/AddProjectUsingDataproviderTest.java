package datadrivenTestUsingDataProvider;

import javax.naming.event.ObjectChangeListener;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClass.genericUtility.AddProjectPOJOTest;

public class AddProjectUsingDataproviderTest {
@Test(dataProvider = "TestBody")
public void addProjectTest(String createdBy, String projectName, String status, int teamSize) {
	AddProjectPOJOTest apj=new AddProjectPOJOTest(createdBy, projectName, status, teamSize);
	given().
	contentType(ContentType.JSON)
	.body(apj)
	.when().post("http://localhost:8084/addProject")
	.then().assertThat().contentType(ContentType.JSON).and()
	.log().all();
}

@DataProvider
public Object[][] TestBody() {
	Object [][] obj = new Object[2][4];
	obj[0][0]="Kalpana";
	obj[0][1]="TYSS-Rmg789";
	obj[0][2]="Created";
	obj[0][3]=5;
	obj[1][0]="Kalpana";
	obj[1][1]="RMG-TYss951";
	obj[1][2]="Created";
	obj[1][3]=12;
	return obj;
}
}
