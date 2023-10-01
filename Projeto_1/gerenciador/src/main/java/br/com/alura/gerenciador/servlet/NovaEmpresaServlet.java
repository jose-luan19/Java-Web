package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
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
	protected void /*doPost*/ service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//Sobreescrevendo o metodo service para aceitar somente o post
		//Recebe parametros pela url http://localhost:8080/gerenciador/novaEmpresa?nome=Alura
		//E retorna sempre uma String.
		String nomeEmpresa = request.getParameter("nome");
		String paramDataAbertura = request.getParameter("data");
		Date dataAbertura = null;
		
		try {
			//Verifica a String da data que foi recebida como parametro, para que tenha o formato
			//"dd/MM/yyyy" e depois transforma ele no tipo Date.
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataAbertura);
			
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>Empresa "+ nomeEmpresa +" Cadastrada </body></html>"); 
		
		//chamar o JSP
//        RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		//Chama o servlet listaEmpresas, ou seja muda o fluxo 
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
        
        //Atribuindo valores ao requeste para que seja usada no JSP
        //Precisa passar um nome para usar como referencia no JSP, e um objeto
//        request.setAttribute("empresa", empresa.getNome());
//        rd.forward(request, response);
		response.sendRedirect("listaEmpresas");
		
	}

}
