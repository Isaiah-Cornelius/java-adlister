package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Config;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        // TODO: ensure the submitted information is valid
        Config config = new Config();
        User checkUser = new MySQLUsersDao(config).findByUsername(username);
        Boolean validAttempt = (
                (!username.isEmpty()) &&
                (!email.isEmpty()) &&
                (!password.isEmpty()) &&
                (checkUser == null)
         );
        // TODO: create a new user based off of the submitted information
        if (validAttempt){
            User addUser = new User(username, email, password);
            DaoFactory.getUsersDao().insert(addUser);
            request.getSession().setAttribute("user", addUser);
            request.getSession().setAttribute("username", username);
            request.getSession().setAttribute("email", email);
            // TODO: if a user was successfully created, send them to their profile
            response.sendRedirect("/profile");
        } else {
            String msg = "";
            if (username.isEmpty()){
                msg += "Enter a username. ";
            }
            if (email.isEmpty()){
                msg += "Enter an email. ";
            }
            if (password.isEmpty()){
                msg += "Enter a password. ";
            }
            if (checkUser != null){
                msg += "Username already in use. ";
            }
            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("/register");
        }
    }
}
