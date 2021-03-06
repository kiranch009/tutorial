package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.User;
import com.services.UserService;
import com.services.impl.UserServiceImpl;
import com.utils.Constants;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService = new UserServiceImpl();

        User user = userService.getUser(request.getParameter("userName"), request.getParameter("password"));
        if (user == null)
        {
            request.setAttribute(Constants.LOGIN_FAILED_KEY, "login failed");
            request.getRequestDispatcher("/index").forward(request, response);
        } else
        {
        	HttpSession session=request.getSession();
        	session.setAttribute(Constants.USER_KEY,user);
            response.sendRedirect(response.encodeRedirectURL("home"));
        }
	}

}
