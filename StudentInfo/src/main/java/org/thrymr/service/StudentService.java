package org.thrymr.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thrymr.model.Student;
import org.thrymr.model.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	//final List<Student> studentList = new ArrayList<>(Arrays.asList(new Student(1l,"Ritesh","Hyderabad"),new Student(2l,"Sunil","Lucknow"),new Student(3l,"Jagasan","Raipur"),new Student(4l,"Sonu","patna")));
	
	public List<Student> getAllStudents(){
		//return studentList;
		List<Student> students=new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	public List<Student> addStudent(Student student){
		//studentList.add(student);
		studentRepository.save(student);
		List<Student> students=new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
		
	}
	
	public Student getStudent(Long id){
		//return studentList.stream().filter(student->student.getId().equals(id)).findFirst().get();
		return studentRepository.findOne(id);
	}
	public void updateStudent(Long id,Student student){
		/*for (int i = 0; i < studentList.size(); i++) {
			Student student1=studentList.get(i);
			if(student1.getId().equals(id)){
				studentList.set(i, student);
				return;
			}
		}*/
		studentRepository.save(student);
		return;
		
	}
	public void delleteStudent(Long id){
		//studentList.removeIf(student->student.getId().equals(id));
		studentRepository.delete(id);
		return;
	}
}
