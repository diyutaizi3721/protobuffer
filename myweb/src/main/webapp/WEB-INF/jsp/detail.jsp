<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
     <table>
         <tr>
			<td><input type="text" name="userName" value="User Name"/></td>
			<td><input type="button" value="filter" /></td>
			<td></td>
			<td></td>
		</tr>
     </table>
	<table>
		
		<tr>
			<th>User ID</th>
			<th>User Name</th>
			<th>Age</th>
			<th>Address</th>
		</tr>
     <c:forEach var="user" items="${userList}">
		<tr>
			<td>${user.userId}</td>
			<td>${user.userName}</td>
			<td>${user.userAge}</td>
			<td>${user.userAddress}</td>
			<td><a href="modify.do?userId=${user.userId}">Modify</a> <a href="remove.do?userId=${user.userId}">Remove</a></td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>