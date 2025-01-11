package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/Ex1")//產生虛擬網頁 , 名稱為 Ex1 ,掛在 /-->http://localhost:8080/WebEx1/
public class Ex1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
    public Ex1() {
        super();
        
    }
    public void init() {
    	System.out.println("init action");
    }
//    @Override
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	System.out.println("service action");
//	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get method");
		
		response.sendRedirect("Http://www.google.com");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Post method");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.print("<h1>Post method,九彩昇華齊聚頂</h1>");
//		doGet(request, response);
	}
    @Override
    public void destroy(){
    	System.out.println("destroy action");
	}
}
