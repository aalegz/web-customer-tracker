package com.aalegz.testdb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        //setuo connection variables
        String user = "springstudent";
        String password = "springstudent";

        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
        // ?serverTimezone=UTC
        String driver = "com.mysql.jdbc.Driver";

        //get connection to database

        try {

            PrintWriter out = response.getWriter();

            out.println("Connecting to DB: " + jdbcUrl);

            Class.forName(driver);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);

            out.println("Connection successful!");

            myConn.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}
