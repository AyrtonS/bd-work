package onclick.bdwork.view.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import onclick.bdwork.model.StudentDisciplineCrossed;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			int credito = Integer.parseInt(request.getParameter("credito"));
			String periodo = request.getParameter("periodo");
			int frequencia = Integer.parseInt(request.getParameter("frequencia"));
			double nota = Double.parseDouble(request.getParameter("nota"));
			int matricula = Integer.parseInt(request.getParameter("matricula"));
			
			StudentDisciplineCrossed studentDisciplineCrossed = new StudentDisciplineCrossed();
			studentDisciplineCrossed.setDisciplinaCodigo(codigo);
			studentDisciplineCrossed.setFrequencia(frequencia);
			studentDisciplineCrossed.setPeriodo(periodo);
			studentDisciplineCrossed.setMatriculaAluno(matricula);
			
			
			
	}

}
