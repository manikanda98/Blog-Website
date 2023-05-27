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
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

    User user= (User)request.getSession().getAttribute("user");
    // Connect to the database
   Connection conn=Dbutil.getConnection();
    // Retrieve the image data from the database
    String sql = "SELECT image_url FROM blog where uid="+ user.getUid();
    PreparedStatement pstmt = conn.prepareStatement(sql);
   
    ResultSet rs = pstmt.executeQuery();
    rs.next();
    byte[] imageData = rs.getBytes("image_url");

    // Set the response headers to indicate that the response contains image data
    response.setContentType("image/jpeg");
    response.setContentLength(imageData.length);

    // Write the image data to the response output stream
    ServletOutputStream out1 = response.getOutputStream();
    out1.write(imageData);

    // Close the database connection and output stream

%>
  
</body>
</html>