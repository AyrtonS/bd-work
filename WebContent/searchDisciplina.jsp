<%@page import="onclick.bdwork.model.Discipline"%>
<%@page import="onclick.bdwork.view.controller.DisciplineController"%>
<%@page import="onclick.bdwork.model.Student"%>
<%@page import="onclick.bdwork.view.controller.StudentController"%>
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
<c:if test="${not empty message}">
		<c:out value="${message}" />
	</c:if>
	
	
	
<h3>Resultado da busca </h3>

	<div class="container">
		
		<table>
			<thead>
				<tr>
					<th>Código</th>
					<th>Nome</th>
					<th>Crédito</th>

				</tr>
			</thead>

			<tbody>
				<form action="cadastro-disciplina.jsp" method="post">
					<%
						if (DisciplineController.getDisciplinesByName().isEmpty() || DisciplineController.getDisciplinesByName()==null) {
					%>
					<p>
						Não existem registros no banco de dados.<a
							href="cadastro-disciplina.jsp">Cadastre o primeiro </a>
					</p>

					<%
						}

						for (Discipline discipline : DisciplineController.getDisciplinesByName()) {
					%>

					<tr>
						<td><%=discipline.getCodigo()%> <input name="codigo"
							type="hidden" value="<%=discipline.getCodigo()%>"> <%
 	request.setAttribute("codigo", discipline.getCodigo());
 %>
						</td>
						<td><%=discipline.getNome()%> <input name="nome" type="hidden"
							value="<%=discipline.getNome()%>"> <%
 	request.setAttribute("nome", discipline.getNome());
 %>
						</td>
						<td><%=discipline.getCredito()%> <input name="credito" type="hidden"
							value="<%=discipline.getCredito()%>"> <%
 	request.setAttribute("credito", discipline.getCredito());
 %>
						</td>
					
						
						<td style="padding: 1%;">
							<button type="submit" class="btn black white-text">
								<i class="material-icons center">edit</i>
							</button>
				</form>
				<form action="deleteDisciplina" method="get">
					<input name="codigo" type="hidden"
						value="<%=discipline.getCodigo()%>">
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