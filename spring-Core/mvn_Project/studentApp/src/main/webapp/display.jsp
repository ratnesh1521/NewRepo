<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.ratnesh.dtos.StudentTo"%>
<%!
StudentTo sto;
%>
<%
sto = (StudentTo)request.getAttribute("sto");
%>

<html>
<body bgcolor="lightblue">
<center>
<br><br><br>
<table border="1" bgcolor="white">
<tr>
	<td>Student Id</td>
	<td><%=sto.getSid() %></td>
</tr>
<tr>
	<td>Student Name</td>
	<td><%=sto.getSname() %></td>
</tr>
<tr>
	<td>Student Address</td>
	<td><%=sto.getSaddr() %></td>
</tr> 
</table>
</center>
</body>
</html>