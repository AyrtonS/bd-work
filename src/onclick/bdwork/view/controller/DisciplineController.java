package onclick.bdwork.view.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import onclick.bdwork.model.Discipline;
import onclick.bdwork.service.DisciplineService;

public class DisciplineController {

	private static DisciplineService disciplineService = new DisciplineService();

	public static boolean addDiscipline(HttpServletRequest request, HttpServletResponse response) {

		Discipline discipline = new Discipline();
		discipline.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		discipline.setCredito(Integer.parseInt(request.getParameter("credito")));
		discipline.setNome(request.getParameter("nome"));
		
		try {
			disciplineService.addDiscipline(discipline);
			
			if (request.getParameter("button_type").equals("0")) {
				System.out.println("Opa entrou  0");
				disciplineService.addDiscipline(discipline);
			} else {
				System.out.println("Opa entrou  1");
				disciplineService.updateDiscipline(discipline);
			}
			
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	
	public static List<Discipline> getDisciplines(){
		return disciplineService.getDisciplines();
	}


	public static boolean deleteDiscipline(Discipline discipline) {
		try{	
			disciplineService.removeDiscipline(discipline);
			return true;
		}catch(Exception e){
			return false;
		}
			
	}

}
