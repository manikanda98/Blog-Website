
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="utility.Dbutil"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.blog.entity.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- basic -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- mobile metas -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<!-- site metas -->
<title>Login</title>
<link rel="icon" type="image/png" href="/images/favicon.png">
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="">
<!-- bootstrap css -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<!-- style css -->
<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- Responsive-->
<link rel="stylesheet" href="css/responsive.css">
<!-- fevicon -->
<link rel="icon" href="images/fevicon.png" type="image/gif" />
<!-- Scrollbar Custom CSS -->
<link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
<!-- Tweaks for older IEs-->
<link rel="stylesheet"
	href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
<!-- owl stylesheets -->
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesoeet" href="css/owl.theme.default.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css"
	media="screen">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<style>
.card {
	border-radius: 30px;
	width: 100%;
}

.card-header {
	background-color: navy;
}

#del {
	
}
</style>


</head>

<body>

	<!-- header section start -->
	<div class="header_section">
		<div class="container-fluid header_main">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<a class="logo" href="index.jsp"><img src="images/logo.png"></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<%!User user = null;%>

				<%
				user = (User) request.getSession().getAttribute("user");

				if (user == null) {
					response.sendRedirect("login.jsp");

				} else {
				%>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="about.jsp">About</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="blog.jsp">Blog</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="contact.jsp">Contact
								Us</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown2"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"><%="Hi " + user.getUserName()%></a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown2">
								<a class="dropdown-item" href="dashboard.jsp">Profile</a> <a
									class="dropdown-item" href="notification.jsp">Notifications</a>
								<%=user.getRole() == "admin"
		? "<a class=\"dropdown-item\" href=\"adminportal.jsp\">Admin Protal</a>"
		: "<a class=\"dropdown-item\" href=\"Myblogs.jsp\">Myblogs</a>"%>
								<div class="dropdown-divider"></div>
								<form method="post" action="LogOutServlet">
									<input type="submit" class="dropdown-item" value="LogOut">
								</form>
							</div></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
	<!-- contact section start -->


	<!-- Details section end -->

	<%
	Connection con = Dbutil.getConnection();
	PreparedStatement ps = con.prepareStatement("select * from blog where uid=" + user.getUid());
	ResultSet rs = ps.executeQuery();
	int i = 1;
	%>

	<%
	while (rs.next()) {
		PreparedStatement ps1 = con.prepareStatement("select uname from user where uid=" + rs.getInt(1));
		ResultSet rs1 = ps1.executeQuery();
		while (rs1.next()) {
	%>
	<div class=<%=rs.getString("blog_id")%> id=<%=rs.getString("blog_id")%>>
		<div class="card mb-3">
			<div class="card-header">
				<h2 id="header"><%=rs1.getString(1)%>
					<img src="images/delete.png" alt="delete" id="del" align="right" width="30px" class="delete">
				</h2>
				<h1 id="blog_id" style="display: none;"><%=rs.getString("blog_id")%></h1>
				<h1 id="uid" style="display: none;"><%=rs.getString("uid")%></h1>
			</div>
			<div class="card-body">
				<h2 class="card-title">
					<%=rs.getString("blog_title")%>
				</h2>
				<p class="card-text"><%=rs.getString("content")%></p>
				<p class="card-text">
					<small class="text-muted">Posted on: <%=rs.getString("date")%>
					</small>
				</p>
			</div>
		</div>
	</div>
	<%
	i++;
	}
	}
	}
	%>
	<!-- contact section end -->
	<!-- footer section start -->
	<div class="footer_section layout_padding">
		<div class="container">
			<div class="footer_menu">
				<ul>
					<li><a href="index.jsp">Home</a></li>
					<li><a href="about.jsp">About</a></li>
					<li><a href="blog.jsp">Blog</a></li>
					<li><a href="contact.jsp">Contact us</a></li>
					<li><a href="register.jsp">Register</a></li>
				</ul>
			</div>
			<div class="footer_menu">
				<ul>
					<li>
						<div class="contact_menu">
							<ul>
								<li><a href="#"><img src="images/call-icon.png"></a></li>
								<li><a href="#">Call : +01 1234567890</a></li>
							</ul>
						</div>
					</li>
					<li>
						<div class="contact_menu">
							<ul>
								<li><a href="blog.jsp"><img src="images/mail-icon.png"></a></li>
								<li><a href="features.jsp">demo@gmail.com</a></li>
							</ul>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<!-- footer section end -->
	<!-- copyright section start -->
	<!-- <div class="copyright_section">
        <div class="container">
            <p class="copyright_text">Copyright 2020 All Right Reserved By.<a href="https://html.design"> Free html
                    Templates</a></p>
        </div>
    </div> -->
	<!-- copyright section end -->
	<!-- Javascript files-->
	<script>
		$("document").ready(function() {
			$(".delete").click(function() {
				var bid = $("#blog_id").text();
				var uid = $("#uid").text();
				// console.log(bid +" "+uid);
				$.post("DeleteServlet", {
					blogid : bid,
					uid : uid
				}, function(data) {
					//console.log(data);
					$("#"+bid).remove();
				});
			});
		});
	</script>

	<script src="js/jquery.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/jquery-3.0.0.min.js"></script>
	<script src="js/plugin.js"></script>
	<!-- sidebar -->
	<script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
	<script src="js/custom.js"></script>
	<!-- javascript -->
	<script src="js/owl.carousel.js"></script>
	<script
		src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
</body>

</html>
