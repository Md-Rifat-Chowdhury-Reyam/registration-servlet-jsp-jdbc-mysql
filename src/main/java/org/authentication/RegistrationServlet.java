package org.authentication;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/registrationServlet")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pwOut = response.getWriter();

        try {
            // loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registration","root","5400");

            PreparedStatement preparedStatement = connection.prepareStatement("insert into users values(?,?,?)");

            String name = request.getParameter("userName");
            String email = request.getParameter("emailId");
            String password = request.getParameter("password");

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);

            int i = preparedStatement.executeUpdate();

            if (i > 0)
            {
                pwOut.println("Registered successfully");

            }
            else {
                pwOut.println("Registration failed");
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }


    }
}
