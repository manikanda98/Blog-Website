<%@page import="javax.imageio.ImageIO"%>
<%@page import="javax.imageio.spi.ImageOutputStreamSpi"%>
<%@page import="com.blog.DAO.*"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="utility.Dbutil"%>
<%@page import="java.sql.*"%>
<%@page import="com.blog.entity.*"%>
<%@page import="jakarta.servlet.http.Part"%>
<%@page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>User Images</title>
</head>
<body>
  <h1>User Images</h1>
  <div>
     <img alt="" src="images/liked-icon.png">
  </div>
</body>
</html>
