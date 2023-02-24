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
    <script type="text/javascript">
      function reloadCode() {
          var time = new Date().getTime();
          document.getElementById("imagecode").src="<%=request.getContextPath()%>/kaptcha?d="+time;
      }
    </script>
  </head>
  <body>
  <form action="check.jsp">
    验证码：<input type="text" name="r" />
    <img alt="验证码" id="imagecode" src="<%=request.getContextPath()%>/kaptcha"/>
    <a href="javascript:reloadCode();">看不清楚</a><br>
    <input type="submit" value="提交">
  </form>

  </body>
</html>
