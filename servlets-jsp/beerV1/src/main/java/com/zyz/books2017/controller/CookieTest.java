package com.zyz.books2017.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ZhangYuanzhuo on 2017/2/25.
 */
public class CookieTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("username");
        Cookie cookie = new Cookie("username", name);
        cookie.setMaxAge(30 * 60);
        resp.addCookie(cookie);

        RequestDispatcher view = req.getRequestDispatcher("/testjsp/cookieresult.jsp");
        view.forward(req, resp);
    }
}
