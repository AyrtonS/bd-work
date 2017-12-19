<%@page import="onclick.bdwork.model.Student"%>
<%@page import="onclick.bdwork.view.controller.StudentController"%>
<%@page import="onclick.bdwork.service.StudentService"%>
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
		<div class="row">
			<form action="busca" method="get">
				<div class="row">
					<div class="input-field col s3"></div>

					<div class="input-field col s12">
						<form action="search" method="get">
						<input value="" id="first_name2" name="search" type="text"
							class="validate"> <label class="active" for="first_name2">Digite
							o nome ou matricula do aluno</label>
						<button type="submit" class="btn indigo black waves-effect right">
							<i class="material-icons">search</i>
						</button>
						</form>
					</div>
				</div>
			</form>
		</div>



	</div>

	<div class="container">
		<h3>Alunos Matriculados</h3>

		<table class="striped">
			<thead>
				<tr>
					<th>Matricula</th>
					<th>Nome</th>
					<th>E-mail</th>
					<th>Data de Nascimento</th>
					<th>Telefone</th>
					<th>Sexo</th>
				</tr>
			</thead>

			<tbody>
				<form action="cadastro-aluno.jsp" method="post">
					<%
						if (StudentController.getList().isEmpty()) {
					%>
					<p>
						Não existem registros no banco de dados.<a
							href="cadastro-aluno.jsp">Cadastre o primeiro aluno</a>
					</p>

					<%
						}

						for (Student student : StudentController.getList()) {
					%>

					<tr>
						<td><%=student.getMatricula()%> <input name="matricula"
							type="hidden" value="<%=student.getMatricula()%>"> <%
 	request.setAttribute("matricula", student.getMatricula());
 %>
						</td>
						<td><%=student.getNome()%> <input name="nome" type="hidden"
							value="<%=student.getNome()%>"> <%
 	request.setAttribute("nome", student.getNome());
 %>
						</td>
						<td><%=student.getEmail()%> <input name="email" type="hidden"
							value="<%=student.getEmail()%>"> <%
 	request.setAttribute("email", student.getEmail());
 %>
						</td>
						<td><%=student.getDataNascimento()%> <input name="data"
							type="hidden" value="<%=student.getDataNascimento()%>"> <%
 	request.setAttribute("data", student.getDataNascimento());
 %>

						</td>
						<td><%=student.getTelefone()%> <input name="telefone"
							type="hidden" value="<%=student.getTelefone()%>"> <%
 	request.setAttribute("telefone", student.getTelefone());
 %>
						</td>
						<td><%=student.getSexo()%> <input name="sexo" type="hidden"
							value="<%=student.getSexo()%>"> <%
 	request.setAttribute("sexo", student.getSexo());
 %>
						</td>
						<td style="padding: 1%;">
							<button type="submit" class="btn black white-text">
								<i class="material-icons center">edit</i>
							</button>
				</form>
				<form action="deleteAluno" method="post">
					<input name="matricula" type="hidden"
						value="<%=student.getMatricula()%>">
					<button type="submit" class="btn red white-text">
						<i class="material-icons center">delete</i>
					</button>

				</form>
				</td>
				</tr>
				<%
					}
				%>



			</tbody>
		</table>
	</div>
</body>
</html>