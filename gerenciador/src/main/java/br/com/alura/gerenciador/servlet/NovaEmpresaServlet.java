package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void /*service*/ doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Sobreescrevendo o metodo service para aceitar somente o post
		System.out.println("Cadastrando");
		//Recebe parametros pela url http://localhost:8080/gerenciador/novaEmpresa?nome=Alura
		//E retorna sempre uma String.
		String nomeEmpresa = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>Empresa "+ nomeEmpresa +" Cadastrada </body></html>");
		
	}

}
