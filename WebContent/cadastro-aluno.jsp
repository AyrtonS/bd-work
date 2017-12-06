<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="top_menu.jsp" />
		
	<hr />

<div class="container">
<c:if test="${not empty message}">
		<c:out value="${message}" />
	</c:if>

	<c:out value="${matricula}"></c:out>

	<form method="post" action="addStudent">
		<input name="matricula" type="text" placeholder="matricula" value="<%=request.getParameter("matricula") %>" /> 
		<input name="nome" type="text" placeholder="nome" value="<%=request.getParameter("nome") %>"/> 
			<input name="email" type="email" placeholder="email" value="<%=request.getParameter("email") %>" /> 
			<input name="telefone" type="tel" placeholder="telefone" value="<%=request.getParameter("telefone") %>" /> 
			<input name="data" type="date" placeholder="Data de nascimento" value="<%=request.getParameter("data") %>"/>
		

		<div class="input-field col s12">
			<select name="sexo">
				<option value="value="<%=request.getParameter("sexo") %>"" disabled selected>Escolha sua opção</option>
				<option value="M">M</option>
				<option value="F">F</option>
				<option value="Outros">Outros</option>
			</select> <label>Materialize Select</label>
		</div>
		<%if(request.getParameter("matricula")==null){ %>
			<input type="hidden" name="button_type" value="0" />
			<button type="submit" class="btn indigo darken-4">Enviar</button>
		<%}else{ %>
	
			<input type="hidden" name="button_type" value="1" />
			<button type="submit" class="btn yellow black-text">Atualizar</button>
		
		<%} %>
	</form>



</div>



</body>
</html>