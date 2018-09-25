<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Notice Page</title>
<style>
table,th,td {
	border: 1px solid black;
}
</style>
</head>
<body>
<%-- Person Add/Edit logic --%>
	<c:if test="${requestScope.error ne null}">
		<strong style="color: red;"><c:out
				value="${requestScope.error}"></c:out></strong>
	</c:if>
	<c:if test="${requestScope.success ne null}">
		<strong style="color: green;"><c:out
				value="${requestScope.success}"></c:out></strong>
	</c:if>
	<c:url value="/addNotice" var="addURL"></c:url>
	<c:url value="/editNotice" var="editURL"></c:url>

	 <%-- Edit Request --%>
	<c:if test="${requestScope.notice ne null}">
		<form action='<c:out value="${editURL}"></c:out>' method="post">
			ID: <input type="text" value="${requestScope.notice.id}"
				readonly="readonly" name="id"><br> 
			Title: <input
				type="text" value="${requestScope.title.name}" name="title"><br>
			<input type="submit"
				value="Edit Notice">
		</form>
	</c:if>

	<%-- Add Request --%>
	<c:if test="${requestScope.notice eq null}">
		<form action='<c:out value="${addURL}"></c:out>' method="post">
			Title: <input type="text" name="title"><br> 
		<input type="submit"
				value="Add Notice">
		</form>
	</c:if>

	 <%-- Persons List Logic --%>
	 <c:if test="${not empty requestScope.notices}">
		<table>
			<tbody>
				<tr>
					<th>ID</th>
					<th>Title</th>
					
				</tr>
				<c:forEach items="${requestScope.notices}" var="notice">
					<c:url value="/editNotice" var="editURL">
						<c:param name="id" value="${notice.id}"></c:param>
					</c:url>
					<c:url value="/deleteNotice" var="deleteURL">
						<c:param name="id" value="${notice.id}"></c:param>
					</c:url>
					<tr>
						<td><c:out value="${notice.id}"></c:out></td>
						<td><c:out value="${notice.title}"></c:out></td>
						<td><a
							href='<c:out value="${editURL}" escapeXml="true"></c:out>'>Edit</a></td>
						<td><a
							href='<c:out value="${deleteURL}" escapeXml="true"></c:out>'>Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if> 
</body>
</html>