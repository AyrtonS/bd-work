<%@page import="onclick.bdwork.model.SchoolRecord"%>
<%@page import="java.util.List"%>
<%@page import="onclick.bdwork.view.controller.MatriculaController"%>
<%@page import="onclick.bdwork.model.StudentDisciplineCrossed"%>
<%@page import="onclick.bdwork.model.Discipline"%>
<%@page import="onclick.bdwork.view.controller.DisciplineController"%>
<%@page import="onclick.bdwork.service.DisciplineService"%>
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

<c:if test="${not empty message}">
		<c:out value="${message}" />
	</c:if>

<form action="checkDisciplineStudentsServlet" method="get">
<div class="row">
<div class="col s3 input-field">
	<select name="disciplina">
		<% for(Discipline discipline : DisciplineController.getDisciplines() ){ %>
		<option value="<%=discipline.getNome()%>"><%=discipline.getNome()%></option>
		<%} %>
	</select>
</div>
<div class="col s3 input-field">
	<select name="disciplina">
		<% for(StudentDisciplineCrossed studentDisciplineCrossed : MatriculaController.getPeriods() ){ %>
		<option value="<%=studentDisciplineCrossed.getPeriodo()%>"><%=studentDisciplineCrossed.getPeriodo()%></option>
		<%} %>
	</select>
	<button type="submit" class="btn black white-text right"><i class="material-icons left">search</i>Buscar</button>
</form>	
</div>
</div>

<hr />

<div class="container">
		
		<table class="striped">
			<thead>
				<tr>
					<th>Nome do Aluno</th>
					<th>Periodo Cursado</th>
					<th>Nota do Aluno</th>
					<th>Frequencia do Aluno</th>
					
				</tr>
			</thead>
			
			<tbody>
				<%if(MatriculaController.getStudentDetailsOnDiscipline(request, response)!= null){ %>
				<h3>Alunos Matriculados nessa disciplina </h3>
				<form action="cadastro-disciplina.jsp" method="post">
					<%
					List<SchoolRecord> lists = MatriculaController.getStudentDetailsOnDiscipline(request, response);
					for(SchoolRecord schoolRecord : lists){ %>
					<tr>
						<td><%=schoolRecord.getNome()%></td>
						<td><%=schoolRecord.getPeriodo()%></td>
						<td><%=schoolRecord.getNota()%></td>
						<td><%=schoolRecord.getFrenquencia()%></td>
					</tr>
					<%} %>
				</form>
				
				<%} %>



			</tbody>
		</table>
	

</div>



</body>
</html>