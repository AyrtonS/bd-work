package onclick.bdwork.view.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import onclick.bdwork.model.Student;
import onclick.bdwork.service.StudentService;

public class StudentController {

	private StudentService studentService = new StudentService();

	public boolean sendData(HttpServletRequest request, HttpServletResponse reponse) {
		try {
			
			Student student = new Student();

			student.setMatricula(Integer.parseInt(request.getParameter("matricula")));
			student.setNome(request.getParameter("nome"));
			student.setEmail(request.getParameter("email"));
			student.setTelefone(request.getParameter("telefone"));
			student.setSexo(request.getParameter("sexo"));

			String dado = request.getParameter("data");
			
					new SimpleDateFormat("dd/MM/yyyy")
					.format(new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy"));
			
			Date date = dado.parse();
			student.setDataNascimento(date);

			studentService.addStudent(student);
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}