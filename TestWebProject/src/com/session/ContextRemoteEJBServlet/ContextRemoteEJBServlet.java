package com.session.ContextRemoteEJBServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.session.ContextRemoteEJBTest.ContextRemoteEJBTestRemote;

/**
 * Servlet implementation class ContextRemoteEJBServlet
 */
@WebServlet("/Context")
public class ContextRemoteEJBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContextRemoteEJBServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.print("Log Start");
		PrintWriter write = response.getWriter();
		InitialContext con;
		try {
			con = new InitialContext();
			//ContextRemoteEJBTestRemote sess = (ContextRemoteEJBTestRemote) con.lookup("java:global/TestWebProject/CustJNDI!com.session.ContextRemoteEJBTest.ContextRemoteEJBTestRemote");//Working
			ContextRemoteEJBTestRemote sess = (ContextRemoteEJBTestRemote) con.lookup("java:global/TestWebProject/CustJNDI");
			//Custom JNDI
			String str = sess.getString();
			write.write(str);
			System.out.print("Log Ends");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
