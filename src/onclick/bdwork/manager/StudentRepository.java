package onclick.bdwork.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import onclick.bdwork.database.ConnectionDatabase;
import onclick.bdwork.model.Student;
import onclick.bdwork.view.interfaces.StudentInterface;

public class StudentRepository implements StudentInterface {

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
		System.out.println("VIGAAA ::: "+ student.getDataNascimento());
		String date = student.getDataNascimento()+"-"+student.getDataNascimento().MONTH + "-"+student.getDataNascimento().YEAR;
		
		String sql = "INSERT INTO aluno(matricula,nome,email,telefone,data_nas,sexo) "
				+ "VALUES ("+ student.getMatricula() + ","
						+ "'" + student.getNome() + "',"
						+ "'" + student.getEmail() + "',"
						+ "'"+ student.getTelefone() + "','" 
						+ student.getDataNascimento() + "','" 
						+ student.getSexo() + "')";

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

		String sql = "UPDATE aluno SET matricula = " + student.getMatricula() 
					+ ", nome = '"+ student.getNome() 
					+ "', email = '" + student.getEmail() 
					+ "', telefone = '" + student.getTelefone()
					+ "', data_nas = '" + student.getDataNascimento() 
					+ "', sexo = '" + student.getSexo()
					+ "' WHERE matricula = " + student.getMatricula();

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
		String sql = "SELECT * FROM aluno ORDER BY nome";

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
				student.setSexo(rs.getString("sexo"));
		/*		Calendar calendar = Calendar.getInstance();
				calendar.setTime(rs.getDate("data_nas").);
				student.setDataNascimento(calendar);
			*/
				students.add(student);
			}

			return students;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public List<Student> getStudent(String param) {
		
		String sql = "SELECT * FROM aluno WHERE "
				+"matricula LIKE '%"+param
				+"%' or nome LIKE '%"+param
				+"%' or email LIKE '%"+param
				+"%' or telefone LIKE '%"+param
				+"%' or sexo LIKE '%"+param+"'";
		
		Connection conn = ConnectionDatabase.getConnection();
		Statement stmt;
		
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			List<Student> students = new ArrayList<>();
			Student newStudent;
			
			while(rs.next()){
				newStudent = new Student();
				newStudent = new Student();
				newStudent.setMatricula(rs.getInt("matricula"));
				newStudent.setNome(rs.getString("nome"));
				newStudent.setEmail(rs.getString("email"));
				newStudent.setTelefone(rs.getString("telefone"));
				newStudent.setSexo(rs.getString("sexo"));
		/*		Calendar calendar = Calendar.getInstance();
				calendar.setTime(rs.getDate("data_nas").);
				student.setDataNascimento(calendar);
			*/
				students.add(newStudent);
				
			}
		
			return students;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

}
