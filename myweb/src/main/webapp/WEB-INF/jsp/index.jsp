<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${user.userId!=null}">
			<form action="handler.do?action=modify" method="post">
		</c:when>
		<c:otherwise>
		   <form action="handler.do?action=save" method="post">
		</c:otherwise>
	</c:choose>

	<table>
		<tr>
			<td>User ID</td>
			<td><input type="text" id="userId" name="userId"  value="${user.userId}" /></td>
		</tr>
		<tr>
			<td>User Name</td>
			<td><input type="text" id="userName" name="userName" value="${user.userName}" /></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="text" id="gender" name="gender" value="${user.gender}" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="add" /></td>
			<td></td>
		</tr>
	</table>
	</form>
</body>
</html>