package onclick.bdwork.view.interfaces;

import java.util.List;

import onclick.bdwork.model.Student;

public interface StudentInterface {
	
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void removeStudent(Student student);
	public List<Student> getStudents();
}
