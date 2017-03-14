<%--
  Created by IntelliJ IDEA.
  User: ZhangYuanzhuo
  Date: 2017/3/14
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Member Comments</title>
</head>
<body>
<strong>Member Comments</strong><br>

<hr>
<c:forEach items="${commentList}" var="comment">
	<em>${comment}</em> <br><br>
</c:forEach>

<hr>
<c:if test="${userType eq 'member'}">
	<jsp:include page="inputComments.jsp"/>
</c:if>
</body>
</html>
