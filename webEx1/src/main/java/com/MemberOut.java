package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemberOut")
public class MemberOut extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MemberOut() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1.設定->request , response
		 * 2.接收
		 * 3.輸出
		 */
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();			
		
		String Name=request.getParameter("name");
		String Phone=request.getParameter("phone");
		String Address=request.getParameter("address");
		String Gender=request.getParameter("gender");
		String[] Interest=request.getParameterValues("interest");
		String sum="";
		for(String x:Interest) {
			sum=sum+x+" ";
		}
		String Career=request.getParameter("career");
		String Memo=request.getParameter("memo");

		out.println("你的基本資料為："+
		"<br>姓名："+Name+
		"<br>電話："+Phone+
		"<br>地址："+Address+
		"<br>性別："+Gender+
		"<br>興趣："+sum+
		"<br>職業："+Career+
		"<br>備註："+Memo);
			
	}


}
