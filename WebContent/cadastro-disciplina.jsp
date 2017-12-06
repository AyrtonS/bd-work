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
<form method="post" action="addDisciplina">
		<%if(request.getParameter("codigo")!=null){ %>
		<input name="codigo" type="text" placeholder="matricula" value="<%=request.getParameter("codigo") %>" /> 
		<input name="nome" type="text" placeholder="nome" value="<%=request.getParameter("nome") %>"/> 
			<input name="credito" type="number" placeholder="Credito" value="<%=request.getParameter("credito") %>" /> 
		<input type="hidden" name="button_type" value="1" />
		<button type="submit" class="btn yellow black-text" >Atualizar</button>	
		
		<%}else{
			%>
			<input name="codigo" type="text" placeholder="matricula" /> 
			<input name="nome" type="text" placeholder="nome" /> 
			<input name="credito" type="number" placeholder="Credito" /> 
			<input type="hidden" name="button_type" value="0" />
			<button type="submit" class="btn black white-text" >Adicionar</button>	
			<%
			
		} %>
</form>

</div>
</body>
</html>