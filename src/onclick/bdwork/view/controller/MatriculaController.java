package onclick.bdwork.view.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import onclick.bdwork.model.SchoolRecord;
import onclick.bdwork.model.StudentDisciplineCrossed;
import onclick.bdwork.service.MatriculaService;

public class MatriculaController {

	public static MatriculaService matriculaService = new MatriculaService();

	public static boolean Matricular(HttpServletRequest request, HttpServletResponse response) {

		try {

			int codigo = Integer.parseInt(request.getParameter("codDisciplina"));
			String periodo = request.getParameter("periodo");
			int frequencia = Integer.parseInt(request.getParameter("frequencia"));
			double nota = Double.parseDouble(request.getParameter("nota"));
			int matricula = Integer.parseInt(request.getParameter("matricula"));

			StudentDisciplineCrossed studentDisciplineCrossed = new StudentDisciplineCrossed();
			studentDisciplineCrossed.setDisciplinaCodigo(codigo);
			studentDisciplineCrossed.setFrequencia(frequencia);
			studentDisciplineCrossed.setPeriodo(periodo);
			studentDisciplineCrossed.setMatriculaAluno(matricula);
			studentDisciplineCrossed.setNota(nota);

			matriculaService.addMatricula(studentDisciplineCrossed);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return false;
	}

	public static List<SchoolRecord> getSchoolRecord(HttpServletRequest request, HttpServletResponse response) {
		
		if(request.getParameter("lookout")!=null){
			int matricula = Integer.parseInt(request.getParameter("lookout"));
			
			return matriculaService.getSchoolRecord(matricula);
		}
		return null;

	}

	public static List<SchoolRecord> getStudentDetailsOnDiscipline(HttpServletRequest request,
			HttpServletResponse response) {
		if(request.getParameter("disciplina")!=null || request.getParameter("periodo") !=null ){
			int disciplina = Integer.parseInt(request.getParameter("disciplina"));
			String periodo = request.getParameter("periodo");
			return matriculaService.getStudentByDisciplineAndPeriod(disciplina, periodo);
		}
		
		return null;

	}
	
	public static List<StudentDisciplineCrossed> getPeriods(){
		return matriculaService.getPeriods();
	}
	
	

}
