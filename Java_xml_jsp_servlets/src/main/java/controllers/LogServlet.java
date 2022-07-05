package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import users.User;
import users.UserCollection;

/**
 * Servlet implementation class LogServlet
 */
@WebServlet("/log")
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       UserCollection collection;
       
    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		collection=UserCollection.getInstance();
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public LogServlet() {
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
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		if(username==null||username.isEmpty()||password==null||password.isEmpty()) {
			out.print("<p style='color:red' Empty fields are not allowed </p>");
			RequestDispatcher re=request.getRequestDispatcher("log.jsp");
			re.include(request, response);
		}else {
			User user=new User(username,password);
			if(collection.checkUser(user))
			{
				out.print("<p style='color:red' Successfully logged in </p>");
				RequestDispatcher re=request.getRequestDispatcher("show.jsp");
				re.include(request, response);
			}
			
		}
	}

}
