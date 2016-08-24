<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../css/custom.css">

        <title>CSS Registration Form</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" type="text/css" href="../css/default.css"/>

    <script src="../js/jquery-1.11.3.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <link href="../css/sidebar.css" rel="stylesheet">
    <%
        String var = request.getParameter("user");
String selectedUser = request.getParameter("selecteduser");
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
            $("#header").load("../header.jsp");
	    $("#sidebar").load("../sidebar.jsp");
            $("#footer").load("../footer.jsp");
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
	<form>
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>Product Name</label>
								<input type="text" placeholder="Enter Product Name Here.." class="form-control">
							</div>
							<div class="col-sm-6 form-group">
								<label>Unit Price</label>
								<input type="text" placeholder="Enter Unit Price Here.." class="form-control">
							</div>
						</div>					
						<div class="form-group">
							<label>Description</label>
							<textarea placeholder="Enter Description Here.." rows="3" class="form-control"></textarea>
						</div>						
					<div class="form-group">
						<label>Product Code</label>
						<input type="text" placeholder="Enter Prodcut Code Here.." class="form-control">
					</div>		
					<div class="form-group">
						<label>Email Address</label>
						<input type="text" placeholder="Enter Email Address Here.." class="form-control">
					</div>	
					<button type="button" class="btn btn-lg btn-info">Submit</button>					
					</div>
				</form>  
</div>            
</div>       
          </div>
</div>            
</div>
<div id="footer"></div>
</html>





