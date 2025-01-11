package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.MemberDaoImpl;
import model.Member;

/**
 * Servlet implementation class addMemberController
 */
@WebServlet("/AddMemberController")
public class AddMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddMemberController() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1.request-->接收 username
		 * 2.findByUsername-->true/false
		 * 3.true-->addMemberError.jsp
		 * 4.false
		 * -->request-->name,password,address,phone,mobile
		 * -->new Member()-->addMember()方法
		 * -->addMemberSuccess.jsp
		 */
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		boolean user=new MemberDaoImpl().findByUsername(Username);
		
		if(user||Username==""||Password=="")
		{
			response.sendRedirect("addMemberError.jsp");
		}
		else
		{
			String Name=request.getParameter("name");
			String Address=request.getParameter("address");
			String Phone=request.getParameter("phone");
			String Mobile=request.getParameter("mobile");
			Member member=new Member(Name,Username,Password,Address,Phone,Mobile);
			new MemberDaoImpl().addMember(member);
			
			response.sendRedirect("addMemberSuccess.jsp");
		}
	}

}
