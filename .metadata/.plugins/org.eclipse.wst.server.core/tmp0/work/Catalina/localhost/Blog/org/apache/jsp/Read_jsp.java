/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-04-20 17:46:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import org.hibernate.internal.build.AllowSysOut;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import utility.Dbutil;
import java.sql.*;
import com.blog.entity.*;
import com.blog.DAO.*;

public final class Read_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

User user = null;
String loginStatus;
  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("com.blog.entity");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_packages.add("com.blog.DAO");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("utility.Dbutil");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("org.hibernate.internal.build.AllowSysOut");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<!-- basic -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- mobile metas -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<!-- site metas -->\r\n");
      out.write("<title>Blog</title>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"/images/favicon.png\">\r\n");
      out.write("<meta name=\"keywords\" content=\"\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<!-- bootstrap css -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<!-- style css -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("<!-- Responsive-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("<!-- fevicon -->\r\n");
      out.write("<link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\r\n");
      out.write("<!-- Scrollbar Custom CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\r\n");
      out.write("<!-- Tweaks for older IEs-->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\r\n");
      out.write("<!-- owl stylesheets -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("<link rel=\"stylesoeet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\"\r\n");
      out.write("	media=\"screen\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

	user = (User) request.getSession().getAttribute("user");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

	loginStatus = ((user == null) ? "<li class=\"nav-item\"><a class=\"nav-link\" href=\"login.jsp\">Login</a></li>"
			: (" <li class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown2\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Hi "
			+ user.getUserName()
			+ "</a><div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown2\"><a class=\"dropdown-item\" href=\"dashboard.jsp\">Profile</a> <a class=\"dropdown-item\" href=\"notification.jsp\">Notifications</a> "
			+ ((user.getRole() == "admin") ? "<a class=\"dropdown-item\" href=\"adminportal.jsp\">Admin Protal</a>"
					: "<a class=\"dropdown-item\" href=\"Myblogs.jsp\">Myblogs</a>")
			+ "<div class=\"dropdown-divider\"></div><form method=\"post\" action=\"LogOutServlet\"><input type=\"submit\" class=\"dropdown-item\" value=\"LogOut\"><form></div></li>"));
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- header section start -->\r\n");
      out.write("	<div class=\"header_section\">\r\n");
      out.write("		<div class=\"container-fluid header_main\">\r\n");
      out.write("			<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("				<a class=\"logo\" href=\"index.jsp\"><img src=\"images/logo.png\"></a>\r\n");
      out.write("				<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("					data-target=\"#navbarSupportedContent\"\r\n");
      out.write("					aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("					aria-label=\"Toggle navigation\">\r\n");
      out.write("					<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("				<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("					<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"about.jsp\">About</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Blog</a></li>\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"contact.jsp\">Contact\r\n");
      out.write("								Us</a></li>\r\n");
      out.write("						");
      out.print(loginStatus);
      out.write("\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</nav>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- blog section start -->\r\n");
      out.write("	");

	Connection con = Dbutil.getConnection();
	PreparedStatement ps = con.prepareStatement("select * from blog where uid=? and blog_id=?");
	ps.setInt(1, Integer.parseInt(request.getParameter("id").trim()));
	ps.setInt(2, Integer.parseInt(request.getParameter("bid").trim()));
	ResultSet rs = ps.executeQuery();
	int i = 1;
	int userId=Integer.parseInt(request.getParameter("id").trim());
	int Blogid=Integer.parseInt(request.getParameter("bid").trim());
	RetriveImage image=new RetriveImage();
   String Img=image.getImageDataForUser(userId, Blogid);
	// System.out.println(Img);
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

	while (rs.next()) {

		PreparedStatement ps1 = con
		.prepareStatement("select uname from user where uid=" + Integer.parseInt(request.getParameter("id")));

		ResultSet rs1 = ps1.executeQuery();
		while (rs1.next()) {
	
      out.write("\r\n");
      out.write("	<div class=\"about_section layout_padding\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-8 col-sm-12\">\r\n");
      out.write("					<div class=\"about_img\">\r\n");
      out.write("						<img src=\"data:image/jpeg;base64,");
      out.print( Img);
      out.write("\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"like_icon\">\r\n");
      out.write("						<img src=\"images/like-icon.png\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<p class=\"post_text\">\r\n");
      out.write("						Post By :");
      out.print(rs.getString("date"));
      out.write("</p>\r\n");
      out.write("					<h2 class=\"most_text\">");
      out.print(rs.getString("blog_title"));
      out.write("\r\n");
      out.write("						<br>\r\n");
      out.write("					</h2>\r\n");
      out.write("					<p class=\"lorem_text\">");
      out.print(rs.getString("content"));
      out.write("</p>\r\n");
      out.write("					<div class=\"social_icon_main\">\r\n");
      out.write("						<div class=\"social_icon\">\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"#\"><img src=\"images/fb-icon.png\"></a></li>\r\n");
      out.write("								<li><a href=\"#\"><img src=\"images/twitter-icon.png\"></a></li>\r\n");
      out.write("								<li><a href=\"#\"><img src=\"images/instagram-icon.png\"></a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"read_bt\">\r\n");
      out.write("							<a href=\"#\">Read More</a>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-4 col-sm-12\">\r\n");
      out.write("					<div class=\"about_main\">\r\n");
      out.write("						<h1 class=\"follow_text\">CONNECT & FOLLOW</h1>\r\n");
      out.write("						<div class=\"follow_icon\">\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"#\"><img src=\"images/fb-icon-1.png\"></a></li>\r\n");
      out.write("								<li><a href=\"#\"><img src=\"images/twitter-icon-1.png\"></a></li>\r\n");
      out.write("								<li><a href=\"#\"><img src=\"images/linkedin-icon-1.png\"></a></li>\r\n");
      out.write("								<li><a href=\"#\"><img src=\"images/instagram-icon-1.png\"></a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");

	i++;
	}
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- blog section end -->\r\n");
      out.write("	<!-- footer section start -->\r\n");
      out.write("	<div class=\"footer_section layout_padding margin_top_90\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<!-- <div class=\"footer_logo\"><a href=\"index.jsp\"><img src=\"images/footer-logo.png\"></a></div> -->\r\n");
      out.write("			<div class=\"footer_menu\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("					<li><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("					<li><a href=\"blog.jsp\">Blog</a></li>\r\n");
      out.write("					<li><a href=\"contact.jsp\">Contact us</a></li>\r\n");
      out.write("					<li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"footer_menu\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li>\r\n");
      out.write("						<div class=\"contact_menu\">\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"#\"><img src=\"images/call-icon.png\"></a></li>\r\n");
      out.write("								<li><a href=\"#\">Call : +01 1234567890</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<div class=\"contact_menu\">\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a href=\"blog.jsp\"><img src=\"images/mail-icon.png\"></a></li>\r\n");
      out.write("								<li><a href=\"features.jsp\">demo@gmail.com</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- footer section end -->\r\n");
      out.write("	<!-- copyright section start -->\r\n");
      out.write("	<!-- <div class=\"copyright_section\">\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("            <p class=\"copyright_text\">Copyright 2020 All Right Reserved By.<a href=\"https://html.design\"> Free  html Templates</a></p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div> -->\r\n");
      out.write("	<!-- copyright section end -->\r\n");
      out.write("	<!-- Javascript files-->\r\n");
      out.write("	<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("	<script src=\"js/popper.min.js\"></script>\r\n");
      out.write("	<script src=\"js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<script src=\"js/jquery-3.0.0.min.js\"></script>\r\n");
      out.write("	<script src=\"js/plugin.js\"></script>\r\n");
      out.write("	<!-- sidebar -->\r\n");
      out.write("	<script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("	<script src=\"js/custom.js\"></script>\r\n");
      out.write("	<!-- javascript -->\r\n");
      out.write("	<script src=\"js/owl.carousel.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
