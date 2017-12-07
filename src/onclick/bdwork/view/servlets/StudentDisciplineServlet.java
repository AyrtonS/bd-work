package onclick.bdwork.view.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import onclick.bdwork.model.StudentDisciplineCrossed;
import onclick.bdwork.view.controller.MatriculaController;

/**
 * Servlet implementation class StudentDisciplineServlet
 */
@WebServlet("/StudentDisciplineServlet")
public class StudentDisciplineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentDisciplineServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean result = MatriculaController.Matricular(request, response);
		
		if (result)
			request.setAttribute("message","A matricula foi salva");
		else 
			request.setAttribute("message", "Um erro ocorreu! A matricula não pode ser salva.");
		
		request.getRequestDispatcher("matricula.jsp").forward(request, response);

	}

}
