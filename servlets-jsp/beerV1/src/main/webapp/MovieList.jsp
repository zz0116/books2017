<%--
  Created by IntelliJ IDEA.
  User: ZhangYuanzhuo
  Date: 2017/3/14
  Time: 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Movie List</title>
</head>
<body>
<strong> Movie List:</strong>
<br><br>

<table>
	<c:forEach var="listElement" items="${movies}">

		<c:forEach var="movie" items="${listElement}">
			<tr>
				<td>${movie}</td>
			</tr>
		</c:forEach>

	</c:forEach>


	<%--<c:forEach var="movie" items="${movieList}" varStatus="movieLoopCount" >--%>
	<%--<tr>--%>
	<%--<td>Count: ${movieLoopCount.count}</td>--%>
	<%--</tr>--%>
	<%--<tr>--%>
	<%--<td>${movie}</td>--%>
	<%--</tr>--%>
	<%--</c:forEach>--%>
</table>

</body>
</html>
