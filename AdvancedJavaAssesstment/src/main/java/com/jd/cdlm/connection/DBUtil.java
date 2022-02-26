package com.jd.cdlm.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	static Connection con = null;
	public static Connection getConnection(){
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCLCDB", "SYS as SYSDBA", "Oradoc_db1"); 
			
			}
		catch(Exception e){e.printStackTrace();}
			
		
		
	      return con;
	}
}

