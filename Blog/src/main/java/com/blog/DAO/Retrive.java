package com.blog.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.blog.entity.User;

import utility.Dbutil;

public class Retrive {
     
	public User retrive(int id) {
		
		 User user=null;
		Connection con=Dbutil.getConnection(); 
		String query="select * from user natural join blog where uid="+id;
		
        try {
			 PreparedStatement s=con.prepareStatement(query);
             ResultSet rs=s.executeQuery();
			 user.setUid(id);
 
		} 
        catch (SQLException e) {
			e.printStackTrace();
		}
       return user;
        
	}
}
