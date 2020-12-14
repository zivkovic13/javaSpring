package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.dao.UserDAO;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	
    	String firstName = request.getParameter("button");
    	String lastName = request.getParameter("button");
    	String email = request.getParameter("button");
    	String password = request.getParameter("button");
    	
    	UserDAO.insertUser(firstName, lastName, email, password);
    	
    	response.sendRedirect("");

//        if ("button1".equals(button)) {
//            myClass.method1();
//        } else if ("button2".equals(button)) {
//            myClass.method2();
//        } else if ("button3".equals(button)) {
//            myClass.method3();
//        } else {
//            // ???
//        }

        request.getRequestDispatcher("/WEB-INF/some-result.jsp").forward(request, response);
    }

}