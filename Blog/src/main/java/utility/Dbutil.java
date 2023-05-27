package utility;

import java.sql.Connection;

import java.sql.DriverManager;

public class Dbutil {
	  public static Connection conn=null;
	  
	     public static Connection  getConnection() {
	         try{  
	             Class.forName("com.mysql.cj.jdbc.Driver");  
	             conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","System");      
	         }catch(Exception e){ 
	             System.out.println(e);
	         }  
	         return conn;
		  
	  }
			  
	  }

