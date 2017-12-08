package onclick.bdwork.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import onclick.bdwork.database.ConnectionDatabase;
import onclick.bdwork.model.SchoolRecord;
import onclick.bdwork.model.Student;
import onclick.bdwork.model.StudentDisciplineCrossed;
import onclick.bdwork.view.interfaces.MateriaInterface;

public class StudentDisciplineRepository implements MateriaInterface {

	@Override
	public void addMatricula(StudentDisciplineCrossed studentDisciplineCrossed) {

		String sql = "INSERT INTO aluno_disciplina(aluno_matr,disciplina_codigo,periodo,nota,frequencia) " + "VALUES ("
				+ studentDisciplineCrossed.getMatriculaAluno() + ",'" + studentDisciplineCrossed.getDisciplinaCodigo()
				+ "','" + studentDisciplineCrossed.getPeriodo() + "','" + studentDisciplineCrossed.getNota() + "','"
				+ studentDisciplineCrossed.getFrequencia() + "')";

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

	@Override
	public List<SchoolRecord> getSchoolRecord(int matricula) {

		String sqlStudent = "SELECT * FROM aluno WHERE matricula = " + matricula;
		Connection conn = ConnectionDatabase.getConnection();
		Statement stmt;
		try {

			stmt = conn.createStatement();
			ResultSet rs1 = stmt.executeQuery(sqlStudent);
			Student student = null;

			while (rs1.next()) {
				student = new Student();
				student.setMatricula(rs1.getInt("matricula"));
			}

			String sql = "SELECT d.codigo,d.nome,sd.periodo,sd.nota,sd.frequencia "
					+ "FROM disciplina d JOIN aluno_disciplina sd ON (d.codigo = sd.disciplina_codigo AND "
					+ "sd.aluno_matr =" + student.getMatricula() + ")";

			ResultSet rs = stmt.executeQuery(sql);
			List<SchoolRecord> records = new ArrayList<>();
			SchoolRecord schoolRecord = null;

			while (rs.next()) {
				
				schoolRecord = new SchoolRecord();
				schoolRecord.setCodDisciplina(rs.getInt("codigo"));
				schoolRecord.setDisciplina(rs.getString("nome"));
				schoolRecord.setFrenquencia(rs.getInt("frequencia"));
				schoolRecord.setNota(rs.getDouble("nota"));
				schoolRecord.setPeriodo(rs.getString("periodo"));
				records.add(schoolRecord);
			}
			
			return records;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<SchoolRecord> getStudentByDisciplineAndPeriod(String discipline, String periodo) {
		
		String sql = "SELECT a.nome,sd.nota,sd.frequencia FROM aluno a JOIN aluno_disciplina sd "
				+ "ON (a.matricula = sd.aluno_matr) JOIN disciplina d "
				+ "ON (sd.disciplina_codigo = d.codigo AND d.nome ='"+discipline+"' and sd.periodo = '"+periodo+"')";
		
		Connection conn = ConnectionDatabase.getConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			List<SchoolRecord> records = new ArrayList<>();
			SchoolRecord schoolRecord;
		
			while(rs.next()){
				schoolRecord =  new SchoolRecord();
				schoolRecord.setNome(rs.getString("nome"));
				schoolRecord.setNota(rs.getDouble("nota"));
				schoolRecord.setFrenquencia(rs.getInt("frequencia"));
				
				records.add(schoolRecord);
			}
			
			return records;
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<StudentDisciplineCrossed> getPeriods() {
		String sql = "SELECT DISTINCT periodo FROM aluno_disciplina ";
		Connection conn = ConnectionDatabase.getConnection();
		try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			List<StudentDisciplineCrossed> stdCrossed = new ArrayList<>();
			StudentDisciplineCrossed studentDisciplineCrossed;
			while(rs.next()){
				studentDisciplineCrossed = new StudentDisciplineCrossed();
				studentDisciplineCrossed.setPeriodo(rs.getString("periodo"));
				
				stdCrossed.add(studentDisciplineCrossed);
			}
			
			return stdCrossed;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	
	
}
