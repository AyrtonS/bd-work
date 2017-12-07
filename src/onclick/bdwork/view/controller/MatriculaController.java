package onclick.bdwork.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import onclick.bdwork.model.StudentDisciplineCrossed;
import onclick.bdwork.service.MatriculaService;

public class MatriculaController {

	public static MatriculaService matriculaService = new MatriculaService();

	public static boolean Matricular(HttpServletRequest request, HttpServletResponse response) {

		try {

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

			matriculaService.addMatricula(studentDisciplineCrossed);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}

}
