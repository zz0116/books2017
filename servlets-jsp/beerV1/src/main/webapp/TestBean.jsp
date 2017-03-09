<%--
  Created by IntelliJ IDEA.
  User: ZhangYuanzhuo
  Date: 2017/3/9
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Test Bean</title>
</head>
<body>
Music is: ${musicList}<br>
Music is: ${musicList[0]}<br>
Music is: ${musicList["1"]}<br>


<%--Dog's name is: ${person.cat.name}--%>


<%--<jsp:useBean id="person" type="com.zyz.books2017.model.Employee"--%>
<%--class="com.zyz.books2017.model.Employee">--%>
<%--<jsp:setProperty name="person" property="*" />--%>
<%--</jsp:useBean>--%>
<%--Person is:--%>
<%--<jsp:getProperty name="person" property="name" /><br>--%>
<%--ID is:--%>
<%--<jsp:getProperty name="person" property="empID" /><br>--%>
</body>
</html>
