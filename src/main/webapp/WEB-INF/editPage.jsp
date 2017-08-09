<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${language.name}</title>
</head>
<body>
	<form:form method="POST" action="/books/edit/${id}" modelAttribute="language">
	    <form:label path="name">Name
	    <form:errors path="name"/>
	    <form:input path="name"/></form:label>
	    
	    <form:label path="creator">Version
	    <form:errors path="creator"/>
	    <form:input path="creator"/></form:label>
	    
	    <form:label path="version">Version
	    <form:errors path="version"/>
	    <form:input path="version"/></form:label>
	    
	    <input type="submit" value="Submit"/>
	</form:form>
	
	<a href="/languages/delete/${id}">Delete</a>
  	<a href="/languages">Dashboard</a>
</body>
</html>