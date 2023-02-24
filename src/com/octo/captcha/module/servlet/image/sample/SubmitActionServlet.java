package com.octo.captcha.module.servlet.image.sample;


import com.octo.captcha.module.servlet.image.SimpleImageCaptchaServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SubmitActionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jcaptcha = request.getParameter("jcaptcha");
        boolean b = SimpleImageCaptchaServlet.validateResponse(request, jcaptcha);
        response.setContentType("text/html;charset=gbk");
        if(b){
            response.getWriter().write("验证通过");
        }else{
            response.getWriter().write("验证失败");
        }
        response.getWriter().write("<br><a href='index.jsp'>再次尝试</a>");
    }
}
