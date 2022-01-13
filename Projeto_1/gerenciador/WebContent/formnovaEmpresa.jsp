<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forms Edita Dados</title>
</head>
<body>

	<!--<c:url value="/novaEmpresa"/>-->
	<!-- Method post para ecrever recurso e não deixar na url  -->
	
	<!--<form action="/gerenciador/novaEmpresa" method="post">-->
	<!--<form action="<c:url value="/novaEmpresa"/>" method="post">-->
	<form action="${linkServletNovaEmpresa}" method="post">

		Nome: <input type="text" name="nome" /> 
		Data Abertura: <input type="text" name="data" /> 
		
		<input type="submit" />

	</form>

</body>
</html>