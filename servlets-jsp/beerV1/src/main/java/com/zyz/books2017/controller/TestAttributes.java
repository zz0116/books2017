package com.zyz.books2017.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ZhangYuanzhuo on 2017/2/23.
 */
public class TestAttributes extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        HttpSession session = req.getSession(false);

        if (session == null) {
            writer.println("no session was available, making one...");
            session = req.getSession();
        } else {
            writer.println("there was a session!");
        }


//        writer.println("test session attributes<br>");
//
//        HttpSession session = req.getSession();
//
//        if (session.isNew()) {
//            writer.println("This is a new session");
//        } else {
//            writer.println("Welcome back!");
//        }

//        synchronized (session) {
//            getServletContext().setAttribute("foo", "22");
//            getServletContext().setAttribute("bar", "42");
//
//            writer.println(getServletContext().getAttribute("foo"));
//            writer.println(getServletContext().getAttribute("bar"));
//        }
    }
}
