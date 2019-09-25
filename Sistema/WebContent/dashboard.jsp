<%@page import="br.ucsal.sistema.model.Usuario"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="repositorio" class="br.ucsal.sistema.util.Repositorio" scope="application" /> 
</head>
<body>
<a href="./Usuarios" >Usuarios</a> | <a href="./Papeis" >Papeis</a> | Usuario: ${usuario.login} - ${usuario.papel.descricao} |<a href="./Logout" >Sair</a>  
<br>
Lista de usuarios <a href="Novo">Novo</a>
<table border="1">
<tr> <th>Login</th> <th>Papel</th> <th>Opções</th>
</tr>

<c:forEach  var="item" items="${lista}" >
<tr>
	<td>${item.login}</td><td><c:out value="${item.papel.descricao}"></c:out></td><td><a href="#?acao=ex&id=${item.id}" >Editar</a> | <a href="Excluir?id=${item.id}" >Excluir</a></td>
</tr>
</c:forEach>


</table>

</body>
</html>