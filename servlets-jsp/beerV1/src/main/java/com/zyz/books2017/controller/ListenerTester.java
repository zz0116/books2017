package com.zyz.books2017.controller;

import com.zyz.books2017.model.Dog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ZhangYuanzhuo on 2017/2/20.
 */
public class ListenerTester extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("test context attributes set by listener<br>");

        writer.println("<br>");

        Dog dog = (Dog) getServletContext().getAttribute("dog");

        writer.println("Dog's breed is: " + dog.getBreed());
    }
}
