<%@page import="onclick.bdwork.view.controller.DisciplineController"%>
<%@page import="onclick.bdwork.model.Discipline"%>
<%@page import="onclick.bdwork.model.Student"%>
<%@page import="onclick.bdwork.view.controller.StudentController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<jsp:include page="top_menu.jsp" />
	<hr />
	<div class="container blue-text" style="padding:2%;">

		<h3 class="center">Realizar Matricula de aluno</h3>
		<form action="studentDiscipline" method="post">
			<div class="row">
				<div class="col s12 input-field">
				<i class="material-icons prefix">account_circle</i><br>
					<select name="matricula">
						<option value="">Selecione um aluno</option>
						<%
						for(Student student : StudentController.getList()){
							%>
							<option value="<%=student.getMatricula()%>"><%=student.getNome()%></option>
							<%
						}
						%>
					</select>
				</div>

			</div>

			<div class="row">
				<div class="col s12 input-field">
				<i class="material-icons prefix">description</i><br>
					<select name="codDisciplina">
						<option value="">Selecione uma disciplina</option>
						<%
						for(Discipline discipline : DisciplineController.getDisciplines()){
							%>
							<option value="<%=discipline.getCodigo()%>"><%=discipline.getNome()%></option>
							<%
						}
						%>
					</select>
				</div>

			</div>

			<div class="row">
				<div class="col s6 input-field">
				<i class="material-icons prefix">date_range</i>
					<input id="periodo" name="periodo" type="text" /> <label
						for="periodo">Ex: 2017.2</label>
				</div>
				<div class="col s6 input-field">
				<i class="material-icons prefix">filter_9_plus</i>
					<input id="nota" name="nota" type="text" /> <label for="nota">Nota
						ex: 10.0</label>
				</div>
				
					<div class="col s12 input-field">
			<i class="material-icons prefix">assignment	</i>
					<input id="frequencia" name="frequencia" type="text" /> <label
						for="frequencia">Frequência</label>
				
				
				</div>
			</div>

			<div class="row center">
		
				<button class="btn black white-text right"><i class="material-icons left">save</i>Gravar</button>
			</div>

		</form>



	</div>




</body>
</html>