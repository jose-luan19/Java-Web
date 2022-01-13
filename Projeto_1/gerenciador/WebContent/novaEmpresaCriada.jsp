
<%
//String nomeEmpresa = "Alura";
//System.out.println(nomeEmpresa);

String nomeEmpresa = (String) request.getAttribute("empresa");
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
	<body>
		<c:if test= "${not empty empresa}">
		Empresa <%out.println(nomeEmpresa);%> cadastrada com sucesso!
		<br/> 
		Empresa	<%=nomeEmpresa%> cadastrada com sucesso!
		<br/>
		<!-- Pega os atributos que foram passadas pelo request getRequestDispatcher, usando
		a referência usada no request.setAttribute -->
		Empresa ${ empresa } cadastrada com sucesso!
		
		</c:if>
		
		<c:if test= "${empty empresa}">
            Nenhuma empresa cadastrada!
        </c:if>
	</body>
</html>

<!-- JavaServer Pages é uma tecnologia que ajuda os desenvolvedores 
de software a criarem páginas web -->