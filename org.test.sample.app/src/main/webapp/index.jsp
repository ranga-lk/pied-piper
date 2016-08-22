<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/custom.css">
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
	    $("#sidebar").load("sidebar.jsp");
            $("#footer").load("footer.jsp");
        });
    </script>
</head>
<body>
<div id="header"></div>


<div id="sidebar">
        <!-- Page Content -->
</div>
<!-- /#page-content-wrapper -->


<div id="page-content-wrapper">

<div class="container">
    <div id="container">
        <div class="row">
            <div class="col-sm-4">
                <h2>Well come to Sample App</h2>
            </div>
        </div>
    </div>
</div>
</div>
<div id="footer"></div>
</body>
</html>
