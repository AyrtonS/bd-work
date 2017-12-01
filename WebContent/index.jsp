<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>




</head>
<body>

	<c:if test="${not empty message}">
		 <c:out value = "${message}"/>
	</c:if>
	<jsp:include page="top_menu.jsp" />
	
	<form method="post" action="addStudent">
		<input name="matricula" type="text" placeholder="matricula" />
		<input name="nome" type="text" placeholder="nome" />
		<input name="email" type="email" placeholder="email" />
		<input name="telefone" type="tel" placeholder="telefone" />
		<input name="data" type="date" placeholder="Data de nascimento" />
		<select name="sexo">
			<option value="">Selecione o Sexo</option>
			<option value="m">M</option>
			<option value="f">F</option>
		</select>
		<button type="submit" class="btn indigo darken-4">Enviar</button>
	</form>

</body>
</html>