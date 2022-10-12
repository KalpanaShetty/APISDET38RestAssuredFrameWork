package genericUtility;
/**
 * RequestSpecBuilder and ResponseSpecBuilder are classes in restAssured Library
 * With the help of which we can store some common Actions in both request 
 * and response
 * @author Kalpana Shetty
 *
 */

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClassWithReqSpec {
	
public JavaLibrary jLib= new JavaLibrary();
public RestAssuredLibrary rLib=new RestAssuredLibrary();
public DatabaseLibrary dLib=new DatabaseLibrary();
public RequestSpecification requestSpec;
public ResponseSpecification responseSpec;
/**
 *  RequestSpecBuilder and ResponseSpecBuilder are classes in restAssured Library
 * With the help of which we can store some common Actions in both resquest 
 * and response
 * @throws Throwable
 */
@BeforeSuite
public void bsConfig() throws Throwable {
	dLib.connectToDB();
	RequestSpecBuilder builder = new RequestSpecBuilder();
	builder.setBaseUri("http://localhost");
	builder.setPort(8084);
	builder.setContentType(ContentType.JSON);
	requestSpec=builder.build();
}
@AfterSuite
public void asConfig() throws Throwable {
	dLib.closeDB();
	ResponseSpecBuilder builder = new ResponseSpecBuilder();
	responseSpec =builder.expectContentType(ContentType.JSON).build();

	 
}
}
