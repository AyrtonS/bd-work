package onclick.bdwork.view.interfaces;

import java.util.List;

import onclick.bdwork.model.StudentDisciplineCrossed;

public interface MateriaInterface {
	
	public void addMatricula(StudentDisciplineCrossed studentDisciplineCrossed);
	public List<StudentDisciplineCrossed> readMatriculas();
	public void updateMatricula(StudentDisciplineCrossed studentDisciplineCrossed);
	public void removeMatricula(StudentDisciplineCrossed studentDisciplineCrossed);

}
