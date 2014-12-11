<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>
	
	<div style="position:absolute;top:25%;left:20%;width:60%;z-index:-1;margin-bottom:50px">
		<c:if test="${ param.success eq true }">
			<div class="alert alert-success">Registration Successful</div>
			 
		</c:if>
		<form:form commandName="organisation" cssClass="form-horizontal">
			<h1>Organisation Registration</h1>
			<div class="form-group">
				<label for="organisationName" class="col-sm-2 control-label">Organisation Name : </label>
				<div class="col-sm-10">
			      <form:input path="organisationName" cssClass="form-control" />
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
				<label for="address" class="col-sm-2 control-label">Address : </label>
				<div class="col-sm-10">
			      <form:input path="address" cssClass="form-control" />
			    </div>
			</div>
			<div class="form-group">
				<label for="description" class="col-sm-2 control-label">About: </label>
				<div class="col-sm-10">
			      <form:input path="description" cssClass="form-control" />
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