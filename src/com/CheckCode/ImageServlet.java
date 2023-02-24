package com.CheckCode;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class ImageServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BufferedImage bufferedImage = new BufferedImage(68, 22, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();
        Color color = new Color(200, 150, 255);
        graphics.setColor(color);
        graphics.fillRect(0,0,68,22);

        char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        Random random = new Random();
        int len = ch.length,index;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0;i<4;i++){
            index = random.nextInt(len);
            graphics.setColor(new Color(random.nextInt(88), random.nextInt(188),random.nextInt(255)));
            graphics.drawString(ch[index]+"",(i*15)+3,18);
            stringBuffer.append(ch[index]);
        }
        request.getSession().setAttribute("piccode",stringBuffer.toString());
        ImageIO.write(bufferedImage,"JPG",response.getOutputStream());
    }
}