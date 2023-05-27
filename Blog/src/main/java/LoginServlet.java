 import com.blog.entity.*;

import com.blog.Encpass.*;

import utility.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email=request.getParameter("email").trim();   
        String pass=request.getParameter("password").trim();
        int uid=0;
        Encrypt en=new Encrypt();
        Connection con=Dbutil.getConnection();
        ResultSet rs = null;
        PreparedStatement s = null;
        String dname = null,demail = null,dpass = null;
        System.out.println(email +" "+pass);
  //  response.getWriter().write(email +" "+pass);
       String query="select * \r\n"
       		+ "from user\r\n"
       		+ "where pass= ? and email=?";
     
	try {
		  
		  s = con.prepareStatement(query);
		  s.setString(1, en.Encpass(pass));
		  s.setString(2, email);
		  rs = s.executeQuery();
		 // System.out.println(rs);
		while(rs.next()) {
			   dname=rs.getString(1);
			   demail=rs.getString(2);
			   dpass=rs.getString(3);
			   uid=rs.getInt(4);	   
	 }
		      
		  if(email.equals(demail) && en.Encpass(pass).equals(dpass)) {
			  User user = new User(dname, demail,dpass,"writer",uid);
			  
			request.getSession().setAttribute("user", user);
			RequestDispatcher rq = request.getRequestDispatcher("dashboard.jsp");
			
			rq.forward(request, response);
		}
	       else
	       {     response.setContentType("text/html");
	    	   PrintWriter out = response.getWriter();
	    	  response.sendRedirect("login.jsp");
	   	       // out.print("1");
	    	 
	       }
		

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
     
       
	}
}
