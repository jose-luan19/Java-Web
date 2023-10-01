package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//config
@WebServlet(urlPatterns = "/oi")
public class OlaMundo extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException {
		//Escrevendo o codigo HTML no meu servidor, a partir da linguagem java, nada automatizado ainda
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Ola Mundo, Primeiro projeto web usando java."); 
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
