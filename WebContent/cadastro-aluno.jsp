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
		


<div class="container">
<c:if test="${not empty message}">
		<c:out value="${message}" />
	</c:if>

	<c:out value="${matricula}"></c:out>
	
	
	<h3>Cadastrar Aluno</h3>
	
	<form method="post" action="addStudent">
	
		
		<%if(request.getParameter("matricula")==null){ %>
			<div class="row">
				<div class="col s12 input-field">
					
					<input id="matricula" name="matricula" type="text" placeholder="matricula"  class="validate"/>
					<label class="active" for="matricula">Matricula</label>
				</div>
				<div class="col s12 input-field">
					<label class="active" for="nome">Nome do aluno</label>
					<input id="nome" name="nome" type="text" placeholder="nome" /> 
				</div>
				<div class="col s12 input-field">
					<label for="email">E-mail</label>
					<input id="email" name="email" type="email" placeholder="email"  />
				</div>
				<div class="col s12 input-field">
					<label for="telefone">Telefone</label>
					<input name="telefone" type="tel" placeholder="telefone" /> 
				</div>
				
			
			
			<input name="data" type="date" placeholder="Data de nascimento" />
			<select name="sexo">
				<option selected>Escolha sua opção</option>
				<option value="M">M</option>
				<option value="F">F</option>
				<option value="Outros">Outros</option>
			</select> <label>Materialize Select</label>
			
			<input type="hidden" name="button_type" value="0" />
			<button type="submit" class="btn indigo darken-4 right">Enviar</button>
			</div>
			
			
			
			 
			
			
		<%}else{ %>
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
			
			<input type="hidden" name="button_type" value="1" />
			<button type="submit" class="btn yellow black-text right">Atualizar</button>
		
		<%} %>
	</form>



</div>



</body>
</html>