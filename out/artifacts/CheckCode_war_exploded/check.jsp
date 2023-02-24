<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ page import="com.google.code.kaptcha.Constants" %>
<%@ page import="java.lang.String" %>
<%
        //检查是否是正确的验证码
    String k = (String) session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
    String r = request.getParameter("r");
    if(k.equals(r))
        out.println("true");
    out.print(k+"----"+r);
%>