package com.zyz.books2017.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ZhangYuanzhuo on 2017/2/20.
 */
public class TestInitParams extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter writer = response.getWriter();
//        writer.println("test init parameters<br>");
//
//        Enumeration e = getServletContext().getInitParameterNames();
//        while (e.hasMoreElements()) {
//            writer.println("<br>param name = " + e.nextElement());
//        }
//        writer.println("<br>main email is " + getServletContext().getInitParameter("mainEmail"));
//        writer.println("<br>admin email is " + getServletContext().getInitParameter("adminEmail"));
    }
}
