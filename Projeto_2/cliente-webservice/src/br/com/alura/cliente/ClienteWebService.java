package br.com.alura.cliente;

import org.apache.http.client.fluent.Request;

//Cliente para solicitar dados da aplicação que está rodando no tomcat
public class ClienteWebService {

	public static void main(String[] args) throws Exception {
		
		String conteudo = Request
			.Post("http://localhost:8080/gerenciador/empresas")
			.addHeader("Accept", "application/json")
			.execute()
			.returnContent()
			.asString();

		System.out.println(conteudo);
		
	}

}
