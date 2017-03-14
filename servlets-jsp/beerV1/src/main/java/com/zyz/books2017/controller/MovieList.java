package com.zyz.books2017.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/3/14.
 */
public class MovieList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] movie1 = {"Matrix Revolutions", "Kill Bill", "Boondock Saints"};
        String[] movie2 = {"Amelie", "Return of the King", "Mean Girls"};
        List movieList = new ArrayList<List>();
        movieList.add(movie1);
        movieList.add(movie2);
        req.setAttribute("movies", movieList);

        RequestDispatcher view = req.getRequestDispatcher("MovieList.jsp");
        view.forward(req, resp);
    }
}
