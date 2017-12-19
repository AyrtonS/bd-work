package onclick.bdwork.view.interfaces;

import java.util.List;

import onclick.bdwork.model.Discipline;
import onclick.bdwork.model.SchoolRecord;
import onclick.bdwork.model.StudentDisciplineCrossed;

public interface MateriaInterface {
	
	public void addMatricula(StudentDisciplineCrossed studentDisciplineCrossed);
	public List<StudentDisciplineCrossed> readMatriculas();
	public void updateMatricula(StudentDisciplineCrossed studentDisciplineCrossed);
	public void removeMatricula(StudentDisciplineCrossed studentDisciplineCrossed);
	public List<SchoolRecord> getSchoolRecord(int matricula);
	public List<SchoolRecord> getStudentByDisciplineAndPeriod(int discipline, String periodo);
	public List<StudentDisciplineCrossed> getPeriods();
}
