<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

	Lista de empresas: <br/>
	
	
	Lista de empresas: <br /> 
    <ul>
    <%
        List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
        for (Empresa empresa : lista) {
    %>
          <li><%= empresa.getNome() %></li>
    <%
        }
    %>
    </ul> 

</body>
</html>