<%--
  Created by IntelliJ IDEA.
  User: 如风
  Date: 2023/2/23
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" pageEncoding="utf-8" %>
<html>
  <head>
    <title>验证码</title>
  </head>
  <body>
  验证码：<input type="text" name="checkcode" />
  <img alt="验证码" src="<%=request.getContextPath()%>/servlet/ImageServlet"/>
  <a href="javascript:reloadCode();">看不清楚</a><br>
  </body>
</html>
