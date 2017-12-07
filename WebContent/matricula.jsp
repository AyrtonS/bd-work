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
	<div class="container center blue-text" style="padding:2%;">

		<h3>Realizar Matricula de aluno</h3>
		<form action="matriculaServlet" method="post">
			<div class="row center">
				<div class="col s12 input-field">
				<i class="material-icons prefix">account_circle</i>
					<input id="matricula" name="matricula" type="text" /> <label
						for="matricula">Informe a matricula do aluno</label>
				</div>

			</div>

			<div class="row center">
				<div class="col s8 input-field">
				<i class="material-icons prefix">description</i>
					<input id="codDisciplina" name="codDisciplina" type="text" /> <label
						for="codDisciplina">Informe o código da disciplina</label>
				</div>

			</div>

			<div class="row center">
				<div class="col s4 input-field">
				<i class="material-icons prefix">date_range</i>
					<input id="periodo" name="periodo" type="text" /> <label
						for="periodo">Ex: 2017.2</label>
				</div>
				<div class="col s4 input-field">
				<i class="material-icons prefix">filter_9_plus</i>
					<input id="nota" name="nota" type="text" /> <label for="nota">Nota
						ex: 10.0</label>
				</div>
				
					<div class="col s8 input-field">
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