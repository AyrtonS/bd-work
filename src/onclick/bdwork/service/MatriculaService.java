package onclick.bdwork.service;

import java.util.List;

import onclick.bdwork.manager.StudentDisciplineRepository;
import onclick.bdwork.model.SchoolRecord;
import onclick.bdwork.model.StudentDisciplineCrossed;
import onclick.bdwork.view.interfaces.MateriaInterface;

public class MatriculaService implements MateriaInterface {
	StudentDisciplineRepository studentDisciplineRepository =  new StudentDisciplineRepository();

	
	@Override
	public void addMatricula(StudentDisciplineCrossed studentDisciplineCrossed) {
		studentDisciplineRepository.addMatricula(studentDisciplineCrossed);
	}

	@Override
	public List<StudentDisciplineCrossed> readMatriculas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMatricula(StudentDisciplineCrossed studentDisciplineCrossed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMatricula(StudentDisciplineCrossed studentDisciplineCrossed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SchoolRecord> getSchoolRecord(int matricula) {
		return studentDisciplineRepository.getSchoolRecord(matricula);
	}

	@Override
	public List<SchoolRecord> getStudentByDisciplineAndPeriod(String discipline, String periodo) {
		return studentDisciplineRepository.getStudentByDisciplineAndPeriod(discipline, periodo);
	}

	@Override
	public List<StudentDisciplineCrossed> getPeriods() {
		return studentDisciplineRepository.getPeriods();
	}
	
	
	
	
	
}
