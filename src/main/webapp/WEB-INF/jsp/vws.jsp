<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../layout/taglib.jsp" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
	
    
    <div style="position:absolute;top:25%;left:20%;width:60%;z-index:-1;margin-bottom:50px">
    	<h1>Your Search Results</h1>
    	<security:authorize access="hasRole('ROLE_ADMIN')">
				<a style="float:right;margin-top:20px;margin-right:20%;" href="#" class="btn btn-primary btn-lg" role="button" data-toggle="modal" data-target="#myModal">Add VW</a>
				<!-- Modal -->
				<form:form commandName="vw" cssClass="form-horizontal">
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				  <div class="modal-dialog">
				    <div class="modal-content" style="margin-top:150px">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				        <h4 class="modal-title" id="myModalLabel">Add New Volunteer Work</h4>
				      </div>
				      <div class="modal-body">
				      	<div class="form-group">
							<label for="organiser_name" class="col-sm-2 control-label">Organiser : </label>
							<div class="col-sm-10">
						      <form:input path="organiser_name" cssClass="form-control" />
						    </div>
						</div>
				        <div class="form-group">
							<label for="name" class="col-sm-2 control-label">Role : </label>
							<div class="col-sm-10">
						      <form:input path="name" cssClass="form-control" />
						    </div>
						</div>
						<div class="form-group">
							<label for="name" class="col-sm-3 control-label">Description : </label>
							<div class="col-sm-9">
						      <form:input path="job_description" cssClass="form-control" />
						    </div>
						</div>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				        <button type="submit" class="btn btn-primary" value="Save">Save</button>
				      </div>
				    </div>
				  </div>
				</div>
				</form:form>
			</security:authorize>
    	<c:forEach items="${vws}" var="vol_work">
    		<h3>${vol_work.name}</h3>
    		<p>${vol_work.organiser_name}</p>
    		<table class="table table-bordered">
    			<thead>
    				<tr>
    					<th>Date Posted</th>
    					<th class="col-md-8">Description</th>
    				</tr>
    			</thead>
    			<tbody>
    				<tr>
    					<th>${vol_work.date_posted}</th>
    					<th>${vol_work.job_description}</th>
    				</tr>
    			</tbody>
    		</table>
    	</c:forEach>
    </div>