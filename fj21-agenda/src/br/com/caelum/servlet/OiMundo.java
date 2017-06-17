package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xml.internal.security.Init;

@WebServlet("/oi")
public class OiMundo extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req,
			               HttpServletResponse resp)
			               throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
        
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>Primeira Servlet</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>Oi mundo Servlet!</h1>");
		writer.println("</body>");
		writer.println("</html>");
		
		System.out.println("Service");
	}
	
	public void init() {
		System.out.println("Init");
	}
	
	public void destroy() {
		System.out.println("Destroy");
	}
}
