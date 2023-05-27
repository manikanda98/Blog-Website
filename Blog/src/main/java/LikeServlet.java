
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.blog.DAO.Insert;
import com.blog.DAO.RetriveImage;
import com.blog.entity.Likes;
import com.blog.entity.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utility.Dbutil;;
@WebServlet("/LikeServlet")
public class LikeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		User user=null;
		System.out.println("Successfully");
		Insert in=new Insert();
		Likes like=new Likes();
		PreparedStatement ps=null;
		Connection con=Dbutil.getConnection();
		user=(User) request.getSession().getAttribute("user");
		like.setUid(Integer.parseInt(request.getParameter("uid")));
		like.setBid(Integer.parseInt(request.getParameter("bid")));
		like.setCount(Integer.parseInt(request.getParameter("liked")));
		//response.getWriter().print(request.getParameter("uid")+" "+request.getParameter("bid"));
		try {
			ps=con.prepareStatement("select * from likes where uid= ? and bid=? ");
			ps.setInt(1, like.getUid());
			ps.setInt(2, like.getBid());
			//	ps.setInt(3, like.getCount());
			ResultSet rs=ps.executeQuery();

			String query="select count(*) from likes where uid=? and bid=?"; //used to find the user already liked or not
			PreparedStatement check=con.prepareStatement(query);
			check.setInt(1, like.getUid());
			check.setInt(2, like.getBid());
			ResultSet count=check.executeQuery();  //used to find no.of rows
			System.out.println(count);
			count.next();
			System.out.println(count.getInt(1)); 
			int did=0,dbid=0,dcount=0;//fetching data from likes to check whether already liked or not
			System.out.println(count.getInt(1));
			if(count.getInt(1)>0) {
				rs.next();
				did=rs.getInt(1);
				dbid=rs.getInt(2);
				dcount=rs.getInt(3);
				if(like.getCount()==0) {
					String upd="update likes set count= ? where uid= ? and bid= ?";
					PreparedStatement up=con.prepareStatement(upd);
					up.setInt(1, 0);
					up.setInt(2, did); 
					up.setInt(3, dbid);
					int n=up.executeUpdate();
					RequestDispatcher dispatcher = request.getRequestDispatcher("blog.jsp");
					dispatcher.forward(request, response); 
//					response.getWriter().print("<a  class=\"like\" onclick=\"myFunction(<%=user.getUid()%>,<%=rs.getInt(\"blog_id\")%>,<%=1%>);\"><img\r\n"
//							+ "src=\"images/like-icon.png\"></a>");
				}
				else
				{
					String upd="update likes set count= ? where uid= ? and bid= ?";
					PreparedStatement up=con.prepareStatement(upd);
					up.setInt(1, 1);
					up.setInt(2, did); 
					up.setInt(3, dbid); 
					//like.setCount(1);
					int n=up.executeUpdate();
					RequestDispatcher dispatcher = request.getRequestDispatcher("blog.jsp");
					dispatcher.forward(request, response); 
					//response.getWriter().print(did+" "+dbid+" "+dcount +n);
					response.getWriter().print("<a onclick=\"myFunction(<%=user.getUid()%>,<%=rs.getInt(\"blog_id\")%>,<%=0%>);\"><img\r\n"
							+ "src=\"images/like-icon.png\"></a>");
				}
				// request.getSession().setAttribute("like",like);

				//RequestDispatcher dispatcher = request.getRequestDispatcher("Like.jsp");
				//dispatcher.forward(request, response); 
				
			} 
			else
			{   

				int n= in.insert(user.getUid(),like.getBid(),like.getCount());
				if(n>0) {    
//					response.getWriter().print("Liked Succesfully");
					RequestDispatcher dispatcher = request.getRequestDispatcher("blog.jsp");
					dispatcher.forward(request, response); 
//					response.getWriter().print("<a   onclick=\"myFunction(<%=user.getUid()%>,<%=rs.getInt(\"blog_id\")%>,<%=1%>);\"><img\r\n"
//							+ "src=\"images/like-icon.png\"></a>");
				}

			}

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
