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
<c:if test="${not empty message}">
		<c:out value="${message}" />
	</c:if>

<div class="container">
<h3>Cadastrar Disciplina</h3>
<form method="post" action="addDisciplina">
		<%if(request.getParameter("codigo")!=null){ %>
		
		
		<div class="row">
				<div class="col s12 input-field">
					<label for="codigo">Digite o código da Disciplina EX:1331</label>
					<input id="codigo" name="codigo" type="text" placeholder="Codigo" value="<%=request.getParameter("codigo") %>"/> 
				</div>
				<div class="col s12 input-field">
					<label for="nome">Digite o nome da Disciplina EX:Banco de dados</label>
					<input id="nome" name="nome" type="text" placeholder="nome" value="<%=request.getParameter("nome") %>"/> 
				</div>
				<div class="col s12 input-field">
					<label for="credito">Digite os créditos da Disciplina EX:64</label>
					<input id="credito" name="credito" type="number" placeholder="Credito" value="<%=request.getParameter("credito") %>"/> 
				</div>
			
					
		<input type="hidden" name="button_type" value="1" />
		<button type="submit" class="btn yellow black-text" >Atualizar</button>	
			</div>
		
	
		
		<%}else{
			%>
			<div class="row">
				<div class="col s12 input-field">
					<label for="codigo">Digite o código da Disciplina EX:1331</label>
					<input id="codigo" name="codigo" type="text" placeholder="Codigo" /> 
				</div>
				<div class="col s12 input-field">
					<label for="nome">Digite o nome da Disciplina EX:Banco de dados</label>
					<input id="nome" name="nome" type="text" placeholder="nome" /> 
				</div>
				<div class="col s12 input-field">
					<label for="credito">Digite os créditos da Disciplina EX:64</label>
					<input id="credito" name="credito" type="number" placeholder="Credito" /> 
				</div>
			
			<input type="hidden" name="button_type" value="0" />
			<button type="submit" class="btn black white-text" >Adicionar</button>	
			</div>
			
			
			

			<%
			
		} %>
</form>

</div>
</body>
</html>