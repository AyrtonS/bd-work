package onclick.bdwork.view.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import onclick.bdwork.view.controller.DisciplineController;

/**
 * Servlet implementation class BuscaDisciplinaServlet
 */
@WebServlet("/buscaDisciplinaServlet")
public class BuscaDisciplinaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscaDisciplinaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			boolean result = DisciplineController.searchDiscipline(request.getParameter("search"));
			if(!result){
				request.setAttribute("message", "Não existe disciplina com esse nome");
			}else{
				request.setAttribute("message", "Busca efetuada com sucesso");
			}
			request.getRequestDispatcher("searchDisciplina.jsp").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
