<%--
  Created by IntelliJ IDEA.
  User: ZhangYuanzhuo
  Date: 2017/3/26
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ attribute name="subTitle" required="true" rtexprvalue="true" %>--%>
<%@ attribute name="fontColor" required="true" %>

<%@ tag body-content="tagdependent" %>

<img src="../images/Web-Services.jpg"><br>
<em><strong><font color="${fontColor}">
	<jsp:doBody/>
</font></strong></em>

<%--<em><strong><jsp:doBody/></strong></em>--%>
<%--<em><strong>${subTitle}</strong></em><br>--%>