package onclick.bdwork.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import onclick.bdwork.database.ConnectionDatabase;
import onclick.bdwork.model.Discipline;
import onclick.bdwork.model.Student;
import onclick.bdwork.view.interfaces.DisciplineInteface;

public class DisciplinaRepository implements DisciplineInteface{

	@Override
	public void addDiscipline(Discipline discipline) {

		String sql = "INSERT INTO disciplina(codigo,nome,credito) " + "VALUES ("
				+ discipline.getCodigo() + ",'" + discipline.getNome() + "','" + discipline.getCredito() + "')";

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
	public void updateDiscipline(Discipline discipline) {
		
		String sql = "UPDATE TABLE aluno SET " 
				+ "codigo =" + discipline.getCodigo() 
				+ " and nome = '" + discipline.getNome()
				+ "' and  credito= " + discipline.getCredito()+" WHERE codigo = "+discipline.getCodigo();

				try {
					Connection connection = ConnectionDatabase.getConnection();
					Statement stmt = connection.createStatement();
					stmt.executeUpdate(sql);

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

	@Override
	public void removeDiscipline(Discipline discipline) {
		
		String sql = "DELETE FROM disciplina WHERE codigo = " + discipline.getCodigo();

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
	public List<Discipline> getDisciplines() {
		String sql = "SELECT * FROM disciplina";

		try {
			Connection connection = ConnectionDatabase.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			List<Discipline> disciplines = new ArrayList<>();
			Discipline discipline;
			while (rs.next()) {
				discipline = new Discipline();
				discipline.setCodigo(rs.getInt("codigo"));
				discipline.setNome(rs.getString("nome"));
				discipline.setCredito(rs.getInt("codigo"));
				
				disciplines.add(discipline);
				
			}
			
			return disciplines;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
