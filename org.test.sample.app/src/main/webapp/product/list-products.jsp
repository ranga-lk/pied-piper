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
    <link href="../css/sidebar.css" rel="stylesheet">
    <script src="../js/bootstrap.min.js"></script>
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
        <div class="col-lg-12">
            <div class="main-box no-header clearfix">
                <div class="main-box-body clearfix">
                    <div class="table-responsive">
                        <table class="table user-list">
                            <thead>
                                <tr>
                                <th><span>User</span></th>
                                <th><span>Created</span></th>
                                <th class="text-center"><span>Status</span></th>
                                <th><span>Email</span></th>
                                <th>&nbsp;</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>
                                        <img src="http://bootdey.com/img/Content/user_1.jpg" alt="">
                                        <a href="#" class="user-link">Full name 1</a>
                                        <span class="user-subhead">Member</span>
                                    </td>
                                    <td>2013/08/12</td>
                                    <td class="text-center">
                                        <span class="label label-default">pending</span>
                                    </td>
                                    <td>
                                        <a href="#">marlon@brando.com</a>
                                    </td>
                                    <td style="width: 20%;">
                                        <a href="#" class="table-link">
                                            <span class="fa-stack">
                                                <i class="fa fa-square fa-stack-2x"></i>
                                                <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                            </span>
                                        </a>
                                        <a href="#" class="table-link">
                                            <span class="fa-stack">
                                                <i class="fa fa-square fa-stack-2x"></i>
                                                <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                            </span>
                                        </a>
                                        <a href="#" class="table-link danger">
                                            <span class="fa-stack">
                                                <i class="fa fa-square fa-stack-2x"></i>
                                                <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                            </span>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <img src="http://bootdey.com/img/Content/user_3.jpg" alt="">
                                        <a href="#" class="user-link">Full name 2</a>
                                        <span class="user-subhead">Admin</span>
                                    </td>
                                    <td>2013/08/12</td>
                                    <td class="text-center">
                                        <span class="label label-success">Active</span>
                                    </td>
                                    <td>
                                        <a href="#">marlon@brando.com</a>
                                    </td>
                                    <td style="width: 20%;">
                                        <a href="#" class="table-link">
                                            <span class="fa-stack">
                                                <i class="fa fa-square fa-stack-2x"></i>
                                                <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                            </span>
                                        </a>
                                        <a href="#" class="table-link">
                                            <span class="fa-stack">
                                                <i class="fa fa-square fa-stack-2x"></i>
                                                <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                            </span>
                                        </a>
                                        <a href="#" class="table-link danger">
                                            <span class="fa-stack">
                                                <i class="fa fa-square fa-stack-2x"></i>
                                                <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                            </span>
                                        </a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <img src="http://bootdey.com/img/Content/user_2.jpg" alt="">
                                        <a href="#" class="user-link">Full name 3</a>
                                        <span class="user-subhead">Member</span>
                                    </td>
                                    <td>2013/08/12</td>
                                    <td class="text-center">
                                        <span class="label label-danger">inactive</span>
                                    </td>
                                    <td>
                                        <a href="#">marlon@brando.com</a>
                                    </td>
                                    <td style="width: 20%;">
                                        <a href="#" class="table-link">
                                            <span class="fa-stack">
                                                <i class="fa fa-square fa-stack-2x"></i>
                                                <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                            </span>
                                        </a>
                                        <a href="#" class="table-link">
                                            <span class="fa-stack">
                                                <i class="fa fa-square fa-stack-2x"></i>
                                                <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                            </span>
                                        </a>
                                        <a href="#" class="table-link danger">
                                            <span class="fa-stack">
                                                <i class="fa fa-square fa-stack-2x"></i>
                                                <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                            </span>
                                        </a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
  </div>
</div>
<div id="footer"></div>
</html>





