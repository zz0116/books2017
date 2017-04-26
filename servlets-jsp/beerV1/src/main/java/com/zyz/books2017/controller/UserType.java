package com.zyz.books2017.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ZhangYuanzhuo on 2017/3/14.
 */
public class UserType extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] commentList = {"This site rocks.", "This site is cool.", "This site is stupid."};
        req.setAttribute("commentList", commentList);

        String userType;
        if ("zyz".equals(req.getParameter("userName"))) {
            userType = "member";
        } else {
            userType = "notMember";
        }
        req.setAttribute("userType", userType);

        RequestDispatcher view = req.getRequestDispatcher("/commentsjsp/memberComments.jsp");
        view.forward(req, resp);
    }
}
