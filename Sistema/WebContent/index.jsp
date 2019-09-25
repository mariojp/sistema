<%@page import="br.ucsal.sistema.util.Repositorio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="repositorio" class="br.ucsal.sistema.util.Repositorio" scope="application" /> 
<%
// Equivalente ao jsp use:bean
// Repositorio repositorio = (Repositorio) application.getAttribute("repositorio");
// if(repositorio == null ){
// 	repositorio = new Repositorio();
// 	application.setAttribute("repositorio", repositorio);
// }
%>

<body>



<form action="./Autenticador" method="post">
Login: <input type="text" name="login" > <br>
Senha: <input type="password" name="senha" ><br>
<button type="submit">Acessar</button>
</form>

</body>
</html>
