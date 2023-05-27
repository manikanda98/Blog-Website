<%@page import="com.blog.entity.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <title>Register</title>
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- bootstrap css -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <!-- style css -->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/cust_style.css">
    <!-- Responsive-->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- fevicon -->
    <link rel="icon" href="images/fevicon.png" type="image/gif" />
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
    <!-- Tweaks for older IEs-->
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
    <!-- owl stylesheets -->
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesoeet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css"
        media="screen">
</head>

<body>

	<%! User user = null; %>
	
	<% user = (User)request.getSession().getAttribute("user"); %>

    <script>
        document.addEventListener("DOMContentLoaded", function (event) {
            function OTPInput() {
                const inputs = document.querySelectorAll('#otp > *[id]');
                for (let i = 0; i < inputs.length; i++) { inputs[i].addEventListener('keydown', function (event) { if (event.key === "Backspace") { inputs[i].value = ''; if (i !== 0) inputs[i - 1].focus(); } else { if (i === inputs.length - 1 && inputs[i].value !== '') { return true; } else if (event.keyCode > 47 && event.keyCode < 58) { inputs[i].value = event.key; if (i !== inputs.length - 1) inputs[i + 1].focus(); event.preventDefault(); } else if (event.keyCode > 64 && event.keyCode < 91) { inputs[i].value = String.fromCharCode(event.keyCode); if (i !== inputs.length - 1) inputs[i + 1].focus(); event.preventDefault(); } } }); }
            } OTPInput();
        });
    </script>
    <!-- header section start -->
    <div class="header_section">
        <div class="container-fluid header_main">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="logo" href="index.jsp"><img src="images/logo.png"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                    aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="index.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="about.jsp">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="blog.jsp">Blog</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="contact.jsp">Contact Us</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="login.jsp">Login</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    </div>
    <!-- contact section start -->
    <div class="contact_section layout_padding">
        <div class="container">
            <!-- <div class="row">
                <div class="col-md-6">
                    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <div class="login_img"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="mail_section">
                        <form action="get">
                            <div class="mail_section">
                                <h1 class="contact_taital">Register</h1>
                                <input type="text" class="email_text" placeholder="userName" name="userName">
                                <input type="text" class="email_text" placeholder="email" name="email">
                                <input type="password" class="pass_text" placeholder="password" name="password">
                                <input type="password" class="pass_text" placeholder="Confirm password" name="password">
                                <div class="read_bt"><a href="login.jsp">Already have an Account?</a></div>
                                <div class="send_bt"><a href="#">Register</a></div>
                            </div>
                        </form>
                    </div>
                </div>
            </div> -->
            <!-- <div class="mail_Section">
                <h1 class="contact_taital">verify your Email</h1>
                <h3>Enter the veriification code sent to your mail</h3>
                <input type="text" class="email_text" placeholder="code" name="ver_code">
            </div> -->
            <div class="container height-100 d-flex justify-content-center align-items-center">
                <div class="position-relative">
                    <div class="card p-2 text-center">
                        <h6>Please enter the one time password to verify your account</h6>
                        <div> <span>A code has been sent to</span> <small>*******@gmail.com</small> </div>
                        <div id="otp" class="inputs d-flex flex-row justify-content-center mt-2"> <input
                                class="m-2 text-center form-control rounded" type="text" id="first" maxlength="1" /> <input
                                class="m-2 text-center form-control rounded" type="text" id="second" maxlength="1" /> <input
                                class="m-2 text-center form-control rounded" type="text" id="third" maxlength="1" /> <input
                                class="m-2 text-center form-control rounded" type="text" id="fourth" maxlength="1" /> <input
                                class="m-2 text-center form-control rounded" type="text" id="fifth" maxlength="1" /> <input
                                class="m-2 text-center form-control rounded" type="text" id="sixth" maxlength="1" /> </div>
                        <div class="mt-4"> <button class="btn validate px-4 btn-warning"><a href="dashboard.jsp">Validate</a></button> </div>
                    </div>
                    <div class="card-2">
                        <div class="content d-flex justify-content-center align-items-center"> <span>Didn't get the code  <a
                                href="#" class="text-decoration-none ms-3">Resend(1/3)</a></span> </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
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
                    <li><a href="login.jsp">Login</a></li>
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
    <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
</body>

</html>