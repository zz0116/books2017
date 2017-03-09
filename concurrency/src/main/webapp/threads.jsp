<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: ZhangYuanzhuo
  Date: 2017/2/17
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>服务器线程信息</title>
</head>
<body>
<pre>
<%
	for (Map.Entry<Thread, StackTraceElement[]> stackTrace :
			Thread.getAllStackTraces().entrySet()) {
		Thread thread = (Thread) stackTrace.getKey();
		StackTraceElement[] stack = stackTrace.getValue();
		if (thread.equals(Thread.currentThread())) {
			continue;
		}
		out.print("\n 线程: " + thread.getName() + "\n");
		for (StackTraceElement element : stack) {
			out.print("\t" + element + "\n");
		}
	}
%>
</pre>
</body>
</html>
