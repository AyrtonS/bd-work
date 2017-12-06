package onclick.bdwork.service;

import java.util.List;

import onclick.bdwork.manager.StudentRepository;
import onclick.bdwork.model.Student;
import onclick.bdwork.view.interfaces.StudentInterface;

public class StudentService implements StudentInterface{
	private StudentRepository studentRepository = new StudentRepository();
	
	@Override
	public void addStudent(Student student) {
		studentRepository.addStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.updateStudent(student);
	}

	@Override
	public void removeStudent(Student student) {
		studentRepository.removeStudent(student);
	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.getStudents();
	}

	public List<Student> getStudent(String parameter) {
		return studentRepository.getStudent(parameter);
		
	}

}
