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
 * Servlet implementation class SchoolRecordServlet
 */
@WebServlet("/schoolRecordServlet")
public class SchoolRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchoolRecordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<SchoolRecord> schoolRecords =  MatriculaController.getSchoolRecord(request, response);
		if(schoolRecords == null || schoolRecords.isEmpty())
			request.setAttribute("message","Não existe aluno com essa matricula");
		
		request.getRequestDispatcher("historico.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
