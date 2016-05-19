package com.session.TestRemoteEJBServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.session.TestRemoteEJB.RemoteEJBTestRemote;

/**
 * Servlet implementation class RemoteEJBServlet
 */
@WebServlet("/Remote")
public class RemoteEJBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	@EJB
	private RemoteEJBTestRemote sess;
	/**/
    public RemoteEJBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("Log Start");
		PrintWriter write=response.getWriter();
		//	InitialContext con=new InitialContext();
		//	RemoteEJBTestRemote sess=(RemoteEJBTestRemote)con.lookup("RemoteEJBTestRemote");
			String str=sess.getString();
			write.write(str);
		System.out.print("Log Ends");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
