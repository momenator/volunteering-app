<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ include file="../layout/taglib.jsp" %>
	
	<div style="position:absolute;top:25%;left:20%;width:60%;z-index:-1;margin-bottom:50px">
		<c:if test="${ param.success eq true }">
			<div class="alert alert-success">Registration Successful</div>
			 
		</c:if>
		<form:form commandName="user" cssClass="form-horizontal">
			<h1>User Registration</h1>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Name : </label>
				<div class="col-sm-10">
			      <form:input path="name" cssClass="form-control" />
			    </div>
			</div>
			<div class="form-group">
				<label for="email" class="col-sm-2 control-label">Email : </label>
				<div class="col-sm-10">
			      <form:input path="email" cssClass="form-control" />
			    </div>
			</div>
			<div class="form-group">
				<label for="password" class="col-sm-2 control-label">Password : </label>
				<div class="col-sm-10">
			      <form:password path="password" cssClass="form-control" />
			    </div>
			</div>
			<div class="form-group">
				<label for="age" class="col-sm-2 control-label">Age : </label>
				<div class="col-sm-10">
			      <form:input type="number" path="age" cssClass="form-control" />
			    </div>
			</div>
			<div class="form-group">
				<label for="sex" class="col-sm-2 control-label">Sex : </label>
				<div class="col-sm-10">
			      <form:input path="sex" cssClass="form-control" />
			    </div>
			</div>
			<div class="form-group">
				<label for="description" class="col-sm-2 control-label">About me : </label>
				<div class="col-sm-10">
			      <form:input path="description" cssClass="form-control" />
			    </div>
			</div>
			<div class="form-group">
				<label for="interest" class="col-sm-2 control-label">Interests: </label>
				<div class="col-sm-10">
			      <form:input path="interest" cssClass="form-control" />
			    </div>
			</div>
			<center>
				<div class="form-group">
					<div class="col-sm-2">
						<input type="submit" value="Register" class="btn btn-lg btn-primary" />
					</div>
				
				</div>
			</center>
		</form:form>
	</div>
