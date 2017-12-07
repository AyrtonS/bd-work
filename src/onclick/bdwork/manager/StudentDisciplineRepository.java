package onclick.bdwork.manager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import onclick.bdwork.database.ConnectionDatabase;
import onclick.bdwork.model.StudentDisciplineCrossed;
import onclick.bdwork.view.interfaces.MateriaInterface;

public class StudentDisciplineRepository implements MateriaInterface{

	@Override
	public void addMatricula(StudentDisciplineCrossed studentDisciplineCrossed) {
		
		String sql = "INSERT INTO aluno_disciplina(aluno_matr,disciplina_cod,periodo,nota,frequencia) " + "VALUES ("
				+ studentDisciplineCrossed.getMatriculaAluno() 
				+ ",'" +studentDisciplineCrossed.getDisciplinaCodigo() 
				+ "','"+studentDisciplineCrossed.getPeriodo() 
				+ "','"+studentDisciplineCrossed.getNota()
				+ "','"+studentDisciplineCrossed.getFrequencia()+"')";

		try {
			Connection connection = ConnectionDatabase.getConnection();
			Statement stmt = connection.createStatement();
			stmt.execute(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
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
	
}
