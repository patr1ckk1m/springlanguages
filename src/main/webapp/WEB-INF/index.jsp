<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Languages</title>
</head>
<body>
	<table class="table">
    <c:forEach items="${languages}" var="language">
        <tr>        
		    <td><c:out value="${language.name}"/></td>
		    <td><c:out value="${language.creator}"/></td>
		    <td><c:out value="${language.version}"/></td>
		    <%-- <td><a href="/books/delete/${loop.index}">Delete</a></td> --%>
        </tr>
    </c:forEach>
    </table>
    
    <form:form method="POST" action="/languages/new" modelAttribute="language">
	    <form:label path="name">Name
	    <form:errors path="name"/>
	    <form:input path="name"/></form:label>
	    
	    <form:label path="creator">Creator
	    <form:errors path="creator"/>
	    <form:textarea path="creator"/></form:label>
	    
	    <form:label path="version">Version
	    <form:errors path="version"/>
	    <form:input path="version"/></form:label>
	    
	    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>