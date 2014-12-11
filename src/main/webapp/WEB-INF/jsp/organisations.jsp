<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../layout/taglib.jsp" %>
	<div style="position:absolute;top:25%;left:20%;width:60%;z-index:-1;margin-bottom:50px">
	
		<c:forEach items="${organisations}" var="organisation">
    		<h3>${organisation.organisationName}</h3>
    		
    	</c:forEach>
    </div>