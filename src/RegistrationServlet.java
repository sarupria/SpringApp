import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8421378104406006927L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(config.getInitParameter("name"));
		super.init(config);
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.write("Hello: " + req.getParameter("p1"));
		System.out.println("hello");
		//System.out.println(req.getAttribute("p1"));
		System.out.println("Hello : " + req.getParameter("p1"));
		req.setAttribute("name", "Gaurav");
		RequestDispatcher rd = req.getRequestDispatcher("Output");
		
		rd.include(req, resp);
		System.out.println(req.getAttribute("name"));
		
	}

}
