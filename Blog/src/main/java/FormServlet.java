

import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;

import com.blog.DAO.Insert;
import com.blog.entity.Blog;
import com.blog.entity.User;


/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
@MultipartConfig
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    Insert in=new Insert();
		User user=null;
	     user = (User)request.getSession().getAttribute("user");
	     int uid=user.getUid();
		String title=request.getParameter("title");
	    String cn_type=request.getParameter("c_type");
  	    String content=request.getParameter("msg");
	    String date=request.getParameter("date");
	    String bid="";
	    Part img = request.getPart("file");
	    InputStream fileContent = img.getInputStream();
	   
	    Blog blog=new Blog(uid, title, cn_type, fileContent, content, date);
	       blog.setBid(uid, title, cn_type, date);
	  int n=in.insert(blog);
	  if(n>0) {
	       response.sendRedirect("BlogWrite.jsp");
	  }
	    response.getWriter().print(title +" "+cn_type+" "+content+" "+img+" "+n);
	    response.setContentType("text/html");

		
		
		
	}

}
