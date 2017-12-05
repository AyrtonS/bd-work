package onclick.bdwork.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import onclick.bdwork.database.ConnectionDatabase;
import onclick.bdwork.model.Student;
import onclick.bdwork.view.interfaces.StudentInterface;

public class StudentRepository implements StudentInterface {

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub

		String sql = "INSERT INTO aluno(matricula,nome,email,telefone,data_nas,sexo) "
				+ "VALUES ("+ student.getMatricula() + ","
						+ "'" + student.getNome() + "',"
						+ "'" + student.getEmail() + "',"
								+ "'"+ student.getTelefone() + "','" + student.getDataNascimento() + "','" + student.getSexo() + "')";

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
	public void updateStudent(Student student) {

		String sql = "UPDATE TABLE aluno SET " 
		+ "matricula =" + student.getMatricula() 
		+ " and nome = " + student.getNome()
		+ " and email = " + student.getEmail() 
		+ "and telefone = " + student.getTelefone() 
		+ "and data_nasc = "+ student.getDataNascimento() 
		+ "and sexo = " + student.getSexo()+" WHERE matricula = "+student.getMatricula();

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
	public void removeStudent(Student student) {

		String sql = "DELETE FROM aluno WHERE matricula = " + student.getMatricula();

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
	public List<Student> getStudents() {
		String sql = "SELECT * FROM aluno";

		try {
			Connection connection = ConnectionDatabase.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			List<Student> students = new ArrayList<>();
			Student student;
			while (rs.next()) {
				student = new Student();
				student.setMatricula(rs.getInt("matricula"));
				student.setNome(rs.getString("nome"));
				student.setEmail(rs.getString("email"));
				student.setTelefone(rs.getString("telefone"));
				student.setDataNascimento(rs.getDate("data_nas"));
				students.add(student);
			}
			
			return students;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	
	}

}
