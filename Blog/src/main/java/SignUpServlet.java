
import com.blog.DAO.*;
import com.blog.Encpass.*;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utility.Dbutil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.blog.entity.*;
import com.blog.DAO.*;
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User s=null;
		int uid=0;
		Insert in=new Insert();
		Encrypt en=new Encrypt();
		String name=request.getParameter("userName");
		String email=request.getParameter("email");
	    String pass=en.Encpass(request.getParameter("password"));
	    String pass1=en.Encpass(request.getParameter("password1"));
	    
	    String UserCount="select count(email) \r\n"
          		+ "from user\r\n"
           		+ "where  email=?";
	    int count=0;
        Connection con=Dbutil.getConnection();
        ResultSet rs = null;
        PreparedStatement ps = null;
          try {
			ps=con.prepareStatement(UserCount);
			ps.setString(1,email);
			rs=ps.executeQuery();
			while(rs.next()) {
				count=rs.getInt(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
	     if(count==1) {
	    	  response.getWriter().print("<script>alert('User Already Signed!')"
  	    	  		+ "</script>");
  	           response.sendRedirect("login.jsp");
	     }
	   
	     else if(!pass.equals(pass1)) {
	    	  response.getWriter().print("<script>alert('both password and confirm password should be same!')"
	    	    	  		+ "</script>");
	    	  response.sendRedirect("register.jsp");
	    }
	    else {
	      
	    	 s =new User(name,email,pass,"Writer",uid);
	    	   
	    	      s.setUserName(name);
		          s.setEmail(email);
		          s.setPassHash(pass);
		          s.setUid(name, email, pass1);
			    	uid=s.getUid();
	    	//  response.getWriter().print(s.getUid());
			    	int n=0;
			    	if(count==0)
	                   n= in.insert(s);
	        // response.getWriter().print(n);
//	         response.getWriter().print(s.getUserName());
//	         response.getWriter().print(" " +s.getEmail());
	       //  response.getWriter().print(" "+n);
	         
         if(n>0) {
	      // response.getWriter().print(pass);
	    	 response.setContentType("text/html");
	    	response.sendRedirect("Welcome.jsp");
         }
	    
		   
	    }
	}


}
