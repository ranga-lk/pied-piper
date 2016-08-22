<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/custom.css">

        <title>CSS Registration Form</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" type="text/css" href="css/default.css"/>

    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <%
        String var = request.getParameter("user");
        if(var!=null){
            session =  request.getSession(true);
            session.setAttribute("user", var);
        }
        session = request.getSession(false);// don't create if it doesn't exist
        String pageURL = "/";
        //if (session.isNew() || session.getAttribute("authenticated") == null || false == (boolean) session.getAttribute("authenticated")) {
         //   response.sendRedirect("login/login.jsp");
        //}
    %>
    <script>
        $(function () {
            $("#header").load("header.jsp");
            $("#footer").load("footer.jsp");
        });
    </script>
</head>
    <body>    
	<div id="header"></div>
<div id="sidebar">
        <!-- Page Content -->
</div>


       <div class="container sign-in-up">
  <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <form action="r" method="post" accept-charset="utf-8" class="form" role="form">   <legend>Sign Up</legend>
                    <div class="row">
                        <div class="col-xs-6 col-md-6">
                            <input type="text" name="firstname" value="" class="form-control input-lg" placeholder="First Name"  />                        </div>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" name="lastname" value="" class="form-control input-lg" placeholder="Last Name"  />                        </div>
                    </div>
                    <input type="text" name="email" value="" class="form-control input-lg" placeholder="Your Email"/>
                    <input type="password" name="password" value="" class="form-control input-lg" placeholder="Password"/>
                    <input type="password" name="confirm_password" value="" class="form-control input-lg" placeholder="Confirm Password"/>
                    <select name="user" value="" class="form-control input-lg">
                        <option value="01">Doctor</option>
                        <option value="02">Patient</option>
                        <option value="03">Service Provider</option>
                    </select>
                    <div class="row">
                        <div class="col-xs-6 col-md-6">
                            <select name="gender" value="" class="form-control input-lg" placeholder="Gender">
                                <option value="01">Male</option>
                                <option value="02">Female</option>
                            </select>
                        </div>
                        <div class="col-xs-6 col-md-6">
                            <div class="form-group">
                                <div class='input-group date' id='datepicker1'>
                                    <input type='text' class="form-control input-lg" />
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-calendar"></span>
                                    </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block signup-btn" type="submit">
                        Create account</button>
            </form>          
          </div>
</div>            
</div>
<div id="footer"></div>
</html>





