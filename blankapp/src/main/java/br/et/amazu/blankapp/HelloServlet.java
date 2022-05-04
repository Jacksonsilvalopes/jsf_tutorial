package br.et.amazu.blankapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name= "HelloServlet", urlPatterns = {"/oi", "/ola"})
public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = -7603622514092516565L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException{
		
		response.setContentType("text/html");
		
		//Escrevendo o conteudo da Pagina
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello World</h1>");
		out.println("</body>");
		out.println("</html>");	
	}
	

}
