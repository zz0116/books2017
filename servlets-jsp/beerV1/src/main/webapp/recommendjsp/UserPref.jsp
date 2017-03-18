<%--
  Created by IntelliJ IDEA.
  User: ZhangYuanzhuo
  Date: 2017/3/18
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>User Preference</title>
</head>
<body>
<c:choose>
	<c:when test="${param.userPref == 'Performance'}">
		Now you can stop even if you <em>do</em> drive insanely
		fast.
	</c:when>

	<c:when test="${param.userPref == 'Safety'}">
		Our brakes will never lock up, no matter how bad a
		driver you are.
	</c:when>

	<c:when test="${param.userPref == 'Maintenance'}">
		Lost your tech job? No problem--you won't have to
		service these brakes for at least three years.
	</c:when>

	<c:otherwise>
		Our brakes are the best.
	</c:otherwise>
</c:choose><br>
<strong>The Brakes</strong><br>
Our advanced anti-lock brake system (ABS) is engineered to give
you the ability to steer even as you're stopping. We have the
best speed sensors of any car this size.<br>
</body>
</html>
