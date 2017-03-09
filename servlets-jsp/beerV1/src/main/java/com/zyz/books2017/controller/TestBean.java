package com.zyz.books2017.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ZhangYuanzhuo on 2017/3/9.
 */
public class TestBean extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] favoriteMusic = {"Zero 7", "Tahiti 80", "BT", "Frou Frou"};
        req.setAttribute("musicList", favoriteMusic);

//        Person p = new Employee();
//        p.setName("Evan");
//
//        Cat cat = new Cat();
//        cat.setName("Spike");
//        p.setCat(cat);
//
//        req.setAttribute("person", p);

        RequestDispatcher view = req.getRequestDispatcher("TestBean.jsp");
        view.forward(req, resp);
    }
}
