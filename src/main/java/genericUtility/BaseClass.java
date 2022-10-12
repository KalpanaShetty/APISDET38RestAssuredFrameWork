package genericUtility;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import genericUtility.JavaLibrary;
import genericUtility.RestAssuredLibrary;

public class BaseClass {
	
	public DatabaseLibrary dLib = new DatabaseLibrary();
	public JavaLibrary jLib = new JavaLibrary();
	public RestAssuredLibrary rLib = new RestAssuredLibrary();
	
	@BeforeSuite
	public void bsConfig() throws SQLException
	{
		//dLib.connectToDB();
		baseURI = "http://localhost";
		port = 8084;
	}
	
	@AfterSuite
	public void asConfig() throws SQLException
	{
		//dLib.closeDB();
		
	}
}
