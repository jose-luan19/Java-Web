<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>

	Lista de empresas: <br/>
	
	<ul>
		<!-- Captura os atributos que foram colocados no request a partir da refer�ncias -->
		<c:forEach items="${empresas}" var="empresa">
			<li>
				${empresa.nome} - 
				<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/mostraEmpresa?id=${empresa.id}">editar</a>
				<a href="/gerenciador/removeEmpresa?id=${empresa.id}">remove</a>
			</li>
			<!-- Por baixo dos panos ser� chamado a fun��o getNome(), por�m posso passar s� o nome
			do atributo, mesmo ele sendo private -->
		</c:forEach>
	
	</ul>
	
	

</body>
</html>