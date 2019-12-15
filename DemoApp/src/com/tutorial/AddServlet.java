package com.tutorial;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i= Integer.parseInt(req.getParameter("number1"));
		int j= Integer.parseInt(req.getParameter("number2"));
		
		int k= i + j;
		
//		req.setAttribute("k", k);		
//		RequestDispatcher rd= req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
//		PrintWriter out = res.getWriter();
//		out.println("result is " + k);		
        
//        HttpSession session=req.getSession();   using sessions
//        session.setAttribute("k", k);
		
		Cookie cookie=new Cookie("k", k+ "");
		res.addCookie(cookie);
        res.sendRedirect("sq");
	}

}
		   