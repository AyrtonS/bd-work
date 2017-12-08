package onclick.bdwork.view.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import onclick.bdwork.model.SchoolRecord;
import onclick.bdwork.view.controller.MatriculaController;

/**
 * Servlet implementation class CheckDisciplineStudentsServlet
 */
@WebServlet("/checkDisciplineStudentsServlet")
public class CheckDisciplineStudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckDisciplineStudentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<SchoolRecord> stds = MatriculaController.getStudentDetailsOnDiscipline(request, response);
		if(stds == null || stds.isEmpty()){
			System.out.println("opa");
			request.setAttribute("message", "Não existe nenhum aluno matriculado nessa disciplina e Periodo");
		}
		
		request.getRequestDispatcher("check-discipline.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
