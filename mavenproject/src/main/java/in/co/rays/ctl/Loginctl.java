package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

/**
 * Servlet implementation class loginctl
 */
@WebServlet("/login")
public class Loginctl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginctl() {
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
		response.setContentType("text/html");
		String emailid=request.getParameter("email");
		String password=request.getParameter("password");
		UserBean bean = new UserBean();
		bean.setEmailid(emailid);
		bean.setPassword(password);
        PrintWriter out=response.getWriter();
		UserModel m = new UserModel();
		HttpSession session=request.getSession();
		try {
			bean=m.authenticate(bean.getEmailid(),bean.getPassword());
			if(bean!=null) {
				session.setAttribute("user", bean);
				RequestDispatcher r=request.getRequestDispatcher("welcome.jsp");
				
				r.forward(request, response);
				
			}
			else {
				RequestDispatcher r=request.getRequestDispatcher("login.jsp");
				request.setAttribute("error", "invalid emailid and password");
				r.forward(request, response);
			}
		}catch (Exception e) {
			e.printStackTrace();	
			}
	}}


