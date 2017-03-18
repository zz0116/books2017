<%--
  Created by IntelliJ IDEA.
  User: ZhangYuanzhuo
  Date: 2017/3/13
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Hello</title>
</head>
<body>
Welcome to our page!

<c:if test="${empty param.userName}">
	<jsp:forward page="HandleIt.jsp"/>
</c:if>


<%--<% if (request.getParameter("userName") == null) { %>--%>

<%--<jsp:forward page="HandleIt.jsp" />--%>

<%--<% } %>--%>

<b>Hello <c:out value="${param.userName}" default="guest"/>.</b>
</body>
</html>
