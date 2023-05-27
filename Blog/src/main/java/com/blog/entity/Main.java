package com.blog.entity;
import com.blog.Encpass.*;
import com.blog.*;
import com.blog.DAO.Insert;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.Dbutil;

public class Main {
public static void main(String[] args) throws SQLException {
//	User user=new User("Manikanda","prasadpmani@gmail.com","Mani@1234");
	//user.setUid(user.getUserName(),user.getEmail(),user.getPassHash());
	//System.out.println(user.getUid());
    Connection con=Dbutil.getConnection();

//    String query="select * \r\n"
//    		+ "    		from user\r\n"
//    		+ "    		where email='prasadpmanikandan@gmail.com'";
//   
   String query="select *"
      		+ "from blog";
      PreparedStatement  s = con.prepareStatement(query);
//    s.setString(1, "Mani@123");
//    ResultSet rs=s.executeQuery();
//    while(rs.next()) {
//    System.out.println(rs.getString(1) +" "+rs.getString(2) );
//    }
//    
//    Encrypt en=new Encrypt();
//  System.out.println(en.Encpass("Mani@123")); 
    
    
 //  Insert en=new Insert();
  
 //int n=  en.insert(user);
    
  // System.out.println(n); 
    

    
//   ResultSet rs=s.executeQuery();
//   while(rs.next()) {
//	   System.out.println(rs.getString("blog_title"));
//   }
     InputStream in=null;
    Blog b=null;
    b=new Blog(777,"title","personal",in,"dhdvjksosudikj","33243","39032");
    b.setB_image(in);
    b.setBlog_Title("hi");
    b.setContent("hlo");
    b.setContent_type("personal");
    b.setDate("3/4/5");
    b.setId(7777777);
    
    int i=0;
    while(i<10) {
    	 b.setBid(b.getId(), b.getBlog_Title(), b.getContent_type(), b.getDate());
      System.out.println(b.getBid());
      i++;}
      
}//98d04f8c7a2b8c01225192f3ea727372
}
