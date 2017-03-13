<%--
  Created by IntelliJ IDEA.
  User: ZhangYuanzhuo
  Date: 2017/3/11
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Test Init Param</title>
</head>
<body>

<jsp:include page="Header.jsp">
	<jsp:param name="subTitle" value="We take the sting out of SOAP"/>
</jsp:include>

<br>
<em>Web Services Support Group.</em> <br><br>
Contact us at: ${initParam.mainEmail}
</body>
</html>
