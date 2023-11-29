package com.assignment.db.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.assignment.db.DbConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Deleting")
public class Deleting extends HttpServlet{
	 @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     PrintWriter out = resp.getWriter(); 
	     out.print("HIO");
		 final String query = "delete from user where userid=?";

	        String userIdParam = req.getParameter("userid");
	      

	        try (Connection connection = DbConnection.getConnection()) {
	            PreparedStatement ps = connection.prepareStatement(query);
	           
	           
	            if (userIdParam != null && !userIdParam.isEmpty()) {
	                ps.setInt(1, Integer.parseInt(userIdParam));
	            } else {
	                // Handle the case where userIdParam is null or empty
	                // You might want to log a message or take appropriate action
	                // For now, let's set it to 0, you may want to change this based on your logic
	                ps.setInt(1, 0);
	            }
	            int rowsAffected = ps.executeUpdate();

	            if (rowsAffected > 0) {
	                resp.getWriter().print("User updated successfully!");
	            } else {
	                resp.getWriter().print("User update failed.");
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	            resp.getWriter().print("Exception: " + e.getMessage());
	        }
	        
	        RequestDispatcher dispatcher = req.getRequestDispatcher("/delete.jsp");
	        dispatcher.forward(req, resp);
	      
	    }
	   @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doPost(req,resp);
		}
}
