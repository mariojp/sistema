<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Salvar" method="post">
Login: <input type="text" name="login" > <br>
Senha: <input type="password" name="senha" ><br>
Papel: <select name="papel">
	<option value="">Selecione</option>
	<c:forEach var="opcao" items="${listaPapeis}">
		<option value="${opcao.id}">${opcao.descricao}</option>
	</c:forEach>
</select>
<br>
<button type="submit">Salvar</button>
</form>
</body>
</html>