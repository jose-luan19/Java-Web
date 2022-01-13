<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/alteraEmpresa" var="linkServletAlteraEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forms Dados</title>
</head>
<body>

	<!--<c:url value="/novaEmpresa"/>-->
	<!-- Method post para ecrever recurso e n�o deixar na url  -->
	
	<!--<form action="/gerenciador/novaEmpresa" method="post">-->
	<!--<form action="<c:url value="/novaEmpresa"/>" method="post">-->
	<form action="${linkServletAlteraEmpresa}" method="post">

		Nome: <input type="text" name="nome" value="${empresa.nome }"/> 
		Data Abertura: <input type="text" name="data" 
		value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> "/> 
		<input type="hidden" name="id" value="${empresa.id }">
		
		<input type="submit" />

	</form>

</body>
</html>