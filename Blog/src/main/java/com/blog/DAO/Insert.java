package com.blog.DAO;

import java.io.InputStream;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.blog.entity.Blog;
import com.blog.entity.User;
import com.mysql.cj.jdbc.Blob;

import utility.Dbutil;
public class Insert {
	
	public int insert(User user) {
		int i=0;
		Connection con=Dbutil.getConnection(); 
		String query="insert into user values(?,?,?,?)";
        try {
			 PreparedStatement s=con.prepareStatement(query);
			int userid=user.getUid();
			String uname=user.getUserName();
			String email=user.getEmail();
			String pass=user.getPassHash();
			s.setString(1, uname);
			s.setString(2, email);
			s.setString(3, pass);
			s.setInt(4, userid);
			i=s.executeUpdate();	 
		} 
        catch (SQLException e) {
			e.printStackTrace();
		}
        if(i>0) {
        	return i;
        }
       return i;
        
	}
	
	
	public int insert(Blog blog) {
		int i=0;
		Connection con=Dbutil.getConnection(); 
		String query="insert into blog values(?,?,?,?,?,?,?)";
        try {
			 PreparedStatement s=con.prepareStatement(query);
			int userid=blog.getUId();
			String title=blog.getBlog_Title();
			String content_type=blog.getContent_type();
			InputStream img=blog.getB_image();
			String content=blog.getContent();
			String date=blog.getDate();
			String bid=blog.getBid();
			s.setInt(1, userid);
			s.setString(2, title);
			s.setString(3,content_type );
			s.setBlob(4, img);
			s.setString(5, content);
			s.setString(6, date);
			s.setInt(7, Integer.parseInt(bid));
			
			i=s.executeUpdate();
		
		} 
        catch (SQLException e) {
			e.printStackTrace();
		}
        if(i>0) {
        	return i;
        }
       return i;  
	}
	
	
	public int insert(int uid,int bid,int count) {
		int i=0;
		Connection con=Dbutil.getConnection(); 
		String query="insert into likes values(?,?,?)";
        try {
			 PreparedStatement s=con.prepareStatement(query);
			 s.setInt(1,uid);
			 s.setInt(2, bid);
			 s.setInt(3, count);
		
			i=s.executeUpdate();	 
		} 
        catch (SQLException e) {
			e.printStackTrace();
		}
        if(i>0) {
        	return i;
        }
       return i;
        
	}
	
	
	
	
	
	
	
	
	
	
	
}
