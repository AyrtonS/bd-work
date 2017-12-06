package onclick.bdwork.view.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import onclick.bdwork.model.Student;
import onclick.bdwork.view.controller.StudentController;

/**
 * Servlet implementation class deleteAlunoServlet
 */
@WebServlet("/deleteAluno")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
     /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStudentServlet() {
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
		
		 Student student = new Student();	
		 
		 student.setMatricula(Integer.parseInt(request.getParameter("matricula")));
		 
		 
		 boolean verified = StudentController.deleteStudent(student);
		 if(verified) 
			 request.setAttribute("message", "Aluno deletado com sucesso");
		 else
			 request.setAttribute("message", "Não foi possivel deletar aluno");

		 request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
