package onclick.bdwork.service;

import java.util.List;

import onclick.bdwork.manager.DisciplinaRepository;
import onclick.bdwork.model.Discipline;
import onclick.bdwork.view.interfaces.DisciplineInteface;

public class DisciplineService implements DisciplineInteface{
	
	DisciplinaRepository disciplinaRepository = new DisciplinaRepository();
	
	@Override
	public void addDiscipline(Discipline discipline) {
		// TODO Auto-generated method stub
		disciplinaRepository.addDiscipline(discipline);
	}

	@Override
	public void updateDiscipline(Discipline discipline) {
		// TODO Auto-generated method stub
		disciplinaRepository.updateDiscipline(discipline);
	}

	@Override
	public void removeDiscipline(Discipline discipline) {
		// TODO Auto-generated method stub
		disciplinaRepository.removeDiscipline(discipline);
	}

	@Override
	public List<Discipline> getDisciplines() {
		// TODO Auto-generated method stub
		return disciplinaRepository.getDisciplines();
	}

}
