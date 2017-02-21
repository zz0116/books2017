package com.zyz.books2017;

import com.zyz.books2017.model.Dog;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by ZhangYuanzhuo on 2017/2/20.
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext sc = event.getServletContext();

        // event从ServletContext中拿到breed-Great Dane键值对
        String dogBreed = sc.getInitParameter("breed");

        Dog d = new Dog(dogBreed);

        sc.setAttribute("dog", d);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
