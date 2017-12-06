package onclick.bdwork.view.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import onclick.bdwork.model.Student;
import onclick.bdwork.service.StudentService;

public class StudentController {

	private static StudentService studentService = new StudentService();
	private static List<Student> list ;
	public boolean sendData(HttpServletRequest request, HttpServletResponse reponse) {
		try {

			Student student = new Student();

			student.setMatricula(Integer.parseInt(request.getParameter("matricula")));
			student.setNome(request.getParameter("nome"));
			student.setEmail(request.getParameter("email"));
			student.setTelefone(request.getParameter("telefone"));
			student.setSexo(request.getParameter("sexo"));

			String dado = request.getParameter("data");
			Calendar calendar = Calendar.getInstance();

			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

			Date date = simpleDateFormat.parse(request.getParameter("data"));

			calendar.set(date.getYear(), date.getMonth(), date.getDay());

			student.setDataNascimento(calendar);

			if (request.getParameter("button_type").equals("0")) {
				System.out.println("Opa entrou  0");
				studentService.addStudent(student);
			} else {
				System.out.println("Opa entrou  1");
				studentService.updateStudent(student);
			}

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static List<Student> getList() {
		return studentService.getStudents();
	}

	public static boolean deleteStudent(Student student) {
		try {
			studentService.removeStudent(student);

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public static boolean search(String parameter) {
		list =  studentService.getStudent(parameter);
		if(list.isEmpty()) return false;
		else return true;
			
	}
	
	
	public static List<Student> getResultList(){
		return list;
	}

}
