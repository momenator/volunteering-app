<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%@ include file="../layout/taglib.jsp" %>
	
    <div style="position:absolute;top:25%;left:20%;width:60%;z-index:-1;margin-bottom:50px">
    	<h2>${user.name}</h2>
    	<p>
    		Description: ${user.description} 
    		<br>
    		DOB: ${user.DOB}
    	</p>
    	<c:forEach items="${user.vw_application.vw_applied}" var="vw">
    		<h3>${vw.name}</h3>
    		<p>${vw.organisation.organisation_name}</p>
    		<table class="table table-bordered">
    			<thead>
    				<tr>
    					<th>Date Posted</th>
    					<th>Description</th>
    				</tr>
    			</thead>
    			<tbody>
    				<tr>
    					<th>${vw.date_posted}</th>
    					<th>${vw.job_description}</th>
    				</tr>
    			</tbody>
    		</table>
    	</c:forEach>
    </div>
    
    
    
  