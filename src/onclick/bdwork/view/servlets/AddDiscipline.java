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
 * Servlet implementation class AddDiscipline
 */
@WebServlet("/addDisciplina")
public class AddDiscipline extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDiscipline() {
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
		// TODO Auto-generated method stub
		
		boolean result = DisciplineController.addDiscipline(request, response);
		if(result) request.setAttribute("message"," A disciplina foi salva com sucesso!");
		else request.setAttribute("message"," Erro : A disciplina não pôde ser salva!");
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}
