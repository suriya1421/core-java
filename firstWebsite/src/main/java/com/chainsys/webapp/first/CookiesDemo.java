package com.chainsys.webapp.first;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookiesDemo
 */
public class CookiesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
        Cookie firstCookie=new Cookie("captain","virat");
        firstCookie.setMaxAge(-1);
        // if value is less than zero then cookie will get deleted immediately after the execution
        response.addCookie(firstCookie);
        Cookie secondCookie=new Cookie("name","suriya/ l̥ñ");
        secondCookie.setMaxAge(22460*60);
        response.addCookie(secondCookie);
        
        Cookie thirdCookie=new Cookie("colour","red");
        response.addCookie(thirdCookie);
        Cookie fourCookie=new Cookie("dessert","butterscotch");
        response.addCookie(fourCookie);
     
     
	}

}
