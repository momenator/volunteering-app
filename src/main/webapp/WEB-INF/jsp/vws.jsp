<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../layout/taglib.jsp" %>
    
    <div style="position:absolute;top:25%;left:20%;width:60%;z-index:-1;margin-bottom:50px">
    	<c:forEach items="${vws}" var="vol_work">
    		<h3>${vol_work.name}</h3>
    		<p>${vol_work.organisation.organisation_name}</p>
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