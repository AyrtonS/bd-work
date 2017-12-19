package onclick.bdwork.view.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import onclick.bdwork.model.Discipline;
import onclick.bdwork.view.controller.DisciplineController;

/**
 * Servlet implementation class DeleteDisciplina
 */
@WebServlet("/deleteDisciplina")
public class DeleteDisciplina extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteDisciplina() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Discipline discipline = new Discipline();

		discipline.setCodigo(Integer.parseInt(request.getParameter("codigo")));

		boolean verified = DisciplineController.deleteDiscipline(discipline);
		
		if (verified)
			request.setAttribute("message", "Disciplina deletada com sucesso");
		else
			request.setAttribute("message", "Não foi possivel deletar aluno");

		request.getRequestDispatcher("disciplinas.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
