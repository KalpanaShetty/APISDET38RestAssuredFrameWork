package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;



/**
 * This library consist of method related to Database
 * @author Kalpana Shetty
 *
 */
public class DatabaseLibrary {

	Driver driverRef;
	Connection con;
	
	/**
	 * this method will establish the connection with mysql db
	 * @author Kalpana Shetty
	 * @throws SQLException
	 */
	public void connectToDB() throws SQLException
	{
		driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		con=DriverManager.getConnection(Iconstants.dbURL, Iconstants.dbUserName, Iconstants.dbPassword);
	}
	
	/**
	 * This method wil close db connection
	 * @author Kalpana Shetty
	 * @throws SQLException
	 */
	public void closeDB() throws SQLException
	{
		con.close();
	}
	
	/**
	 * @author Kalpana Shetty
	 * This method will execute the query and return the value only if the validation is successful
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws SQLException
	 */
	public String readDataFromDBAndValidate(String query, int columnIndex, String expData) throws SQLException
	{
		boolean flag = false;
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
			{
				flag = true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("verified");
			return expData;
			
		}
		else
		{
			System.out.println("data not verfied");
			return "";
		}
			
	}
}
