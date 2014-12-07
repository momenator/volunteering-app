<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <table class="table table-bordered table-hover table-striped" style="position:absolute;top:25%;left:20%;width:60%">
    	<thead>
    		<th>User Name</th>
    	</thead>
    	<tbody>
    		<c:forEach items="${users}" var="user">
    			<tr>
    				<td>
    					${user.name}
    				</td>
    			</tr>
    		</c:forEach>
    	</tbody>
    </table>