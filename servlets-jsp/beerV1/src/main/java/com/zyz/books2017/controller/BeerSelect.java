package com.zyz.books2017.controller;

import com.zyz.books2017.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/2/17.
 */
public class BeerSelect extends HttpServlet {

	protected void doPost(HttpServletRequest request,
						  HttpServletResponse response)
			throws ServletException, IOException {

        response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("Beer Selection Advice<br>");

		String c = request.getParameter("color");

//		out.println("<br>Got beer color " + c);

		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);

//		Iterator it = result.iterator();
//		while (it.hasNext()) {
//			out.print("<br>try: " + it.next());
//		}

		request.setAttribute("styles", result);

        RequestDispatcher view =
                request.getRequestDispatcher("result.jsp");

		view.forward(request, response);
	}

}
