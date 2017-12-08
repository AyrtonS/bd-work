<%@page import="java.util.List"%>
<%@page import="onclick.bdwork.model.SchoolRecord"%>
<%@page import="onclick.bdwork.view.controller.MatriculaController"%>
<%@page import="onclick.bdwork.view.controller.DisciplineController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<jsp:include page="top_menu.jsp" />
	<hr />
	<c:if test="${not empty message}">
		<c:out value="${message}" />
	</c:if>

	<div class="row" style="padding: 2%;">
		<div class="col s4 input-field">
			<form action="schoolRecordServlet" method="get">
				<input name="lookout" id="lookout" type="text"> 
				<label for="lookout">Digite matrícula do aluno</label>
				<button type="submit" class="btn indigo right">
					<i class="material-icons">search</i>
				</button>
			</form>
		</div>
	</div>

	<div class="container">


		<table class="striped">
			<thead>
				<tr>
					<th>Código da Disciplina</th>
					<th>Nome da Disciplina</th>
					<th>Frequencia do Aluno</th>
					<th>Nota do Aluno</th>
					<th>Periodo Cursado</th>
				</tr>
			</thead>
			
			<tbody>
				<%if(MatriculaController.getSchoolRecord(request, response)!= null){ %>
				<h3>Histórico Acadêmico</h3>
				<form action="cadastro-disciplina.jsp" method="post">
					<%
					List<SchoolRecord> lists = MatriculaController.getSchoolRecord(request, response);
					for(SchoolRecord schoolRecord : lists){ %>
					<tr>
						<td><%=schoolRecord.getCodDisciplina()%></td>
						<td><%=schoolRecord.getDisciplina()%></td>
						<td><%=schoolRecord.getFrenquencia()%></td>
						<td><%=schoolRecord.getNota()%></td>
						<td><%=schoolRecord.getPeriodo()%></td>
					</tr>
					<%} %>
				</form>
				
				<%} %>



			</tbody>
		</table>








	</div>


</body>
</html>