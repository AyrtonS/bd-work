package onclick.bdwork.view.interfaces;

import java.util.List;

import onclick.bdwork.model.Discipline;

public interface DisciplineInteface {
	
	public void addDiscipline(Discipline discipline);
	public void updateDiscipline(Discipline discipline);
	public void removeDiscipline(Discipline discipline);
	public List<Discipline> getDisciplines();
	public List<Discipline> getDisciplineByName(String name);
	
}
