package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex2")
public class Ex2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Ex2() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();			
		
		String UserName=request.getParameter("username");
		String Password=request.getParameter("password");
		String Address=request.getParameter("address");
		
		out.println("帳號:"+UserName+
				"<br>密碼:"+Password+
				"<br>地址:"+Address);
			
		/*System.out.println("帳號:"+UserName+
				"\t密碼:"+Password+
				"\t地址:"+Address);*/		
	}

}