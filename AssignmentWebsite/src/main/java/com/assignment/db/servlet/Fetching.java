package com.assignment.db.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.assignment.db.DbConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/fetch")
public class Fetching extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out = resp.getWriter();
	final String query = "select name ,email,password from user ";
	
	try (Connection connection = DbConnection.getConnection()){
		   PreparedStatement ps = connection.prepareStatement(query) ; 
    	  ResultSet rs = ps.executeQuery();
    	  
    	   out.println("<html>");
    	    out.println("<head><title>Account Data</title></head>");
    	    out.println("<body style='text-align: center;'>");
    	    out.println("<h2>Account Data</h2>");
    	    out.println("<table border='1' align='center' style='width:70%; margin-top:20px; margin-bottom:20px;'>");
    	    out.println("<thead>"
    	    		+ "<tr>"
    	    		+ "<th>Name</th>"
    	    		+ "<th>Email</th>"
    	    		+ "<th>Password</th>"
    	    		+ "</tr></thead>");
    	    out.println("<tbody>");

          while (rs.next()) {
              out.println("<tr>");
              out.println("<td>" + rs.getString("name") + "</td>");
              out.println("<td>" + rs.getString("email") + "</td>");
              out.println("<td>" + rs.getString("password") + "</td>");
              out.println("</tr>");
          }

          out.println("</tbody>");
          out.println("</table>");
          out.println("</body>");
          out.println("</html>");
           
	}catch(SQLException | ClassNotFoundException e){
		   e.printStackTrace();
   	    out.println("Exception: " + e.getMessage());
	}
out.print("<a  href ='register' style=\"color: red;padding-right: 10px; \">Register</a>");
out.print("<a href='Updating' style = \"color:red;\"> Update</a>");
}
}
