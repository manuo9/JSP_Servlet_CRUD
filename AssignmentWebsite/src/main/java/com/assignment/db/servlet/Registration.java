package com.assignment.db.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.assignment.db.DbConnection;
import com.assignment.db.entity.User;

@SuppressWarnings("serial")
@WebServlet("/register")
public class Registration extends HttpServlet {
	
	
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	final String query = "insert into user (name, email, password) values(?,?,?)";
	PrintWriter out = resp.getWriter();
	out.print("fsdi");
    
	   String name = req.getParameter("name");
       String email = req.getParameter("email");
       String password = req.getParameter("password");

       User user = new User();
       user.setName(name);
       user.setEmail(email);
       user.setPassword(password);
       
       System.out.println("Received request for registration.");
       
       try (Connection connection = DbConnection.getConnection()){
    	   System.out.println("Connection established successfully.");
    	   PreparedStatement ps = connection.prepareStatement(query) ; 
    	   ps.setString(1, user.getName());
    	   ps.setString(2, user.getEmail());
           ps.setString(3, user.getPassword());
           int rowsAffected = ps.executeUpdate();
           System.out.println("Rows affected: " + rowsAffected);

           if (rowsAffected > 0) {
               out.print("User registered successfully!");
           } else {
               out.print("User registration failed.");
           }
       } catch (ClassNotFoundException | SQLException e) {
    	    e.printStackTrace();
    	    out.println("Exception: " + e.getMessage());
    	}
      
       RequestDispatcher dispatcher = req.getRequestDispatcher("/register.jsp");
       dispatcher.forward(req, resp);
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
