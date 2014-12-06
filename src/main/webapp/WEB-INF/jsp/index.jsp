<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- left panel -->
	<div style="position:absolute;top:25%;left:19%">
		<form class="navbar-form navbar-left" role="search">
		  <div class="form-group">
		    <input type="text" class="form-control" placeholder="Search Volunteering..." style="width:350px;height:40px">
		  </div>
		  <br>
		  <button type="submit" class="btn btn-primary btn-lg" style="float:right;margin-top:20px;height:40px;width:100px">Go</button>
		</form> 
	</div>
	<div style="position:absolute;top:26%;right:20%">
		<div class="btn-group">
		  <button type="button" class="btn btn-default" style="width:300px;height:40px">Category</button>
		  <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-expanded="false" style="height:40px">
		    <span class="caret"></span>
		    <span class="sr-only">Toggle Dropdown</span>
		  </button>
		  <ul class="dropdown-menu" role="menu" style="width:300px">
		    <li><a href="#">Human Rights</a></li>
		    <li><a href="#">Elderly Care</a></li>
		    <li><a href="#">Children Care</a></li>
		    <li><a href="#">Tutoring</a></li>
		   	<li><a href="#">Ushering</a></li>
		   	<li><a href="#">Work Experience</a></li>
		  </ul>
		</div>
		<br>
		<a style="float:right;margin-top:40px">Advanced Search</a>
	</div>
</body>
</html>