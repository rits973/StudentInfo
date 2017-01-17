package org.thrymr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.thrymr.model.Student;
import org.thrymr.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping(value="/student" , method = RequestMethod.GET)
	public List<Student> getAllStudentDetails(){
		return service.getAllStudents();
	}

	@RequestMapping(value="/student/{id}" , method = RequestMethod.GET)
	public Student getStudentById(@PathVariable Long id){
		return service.getStudent(id);
	}
	@RequestMapping(value="/student" , method = RequestMethod.POST)
	public List<Student> addStudent(@RequestBody Student student){
		return service.addStudent(student);
	}
	@RequestMapping(value="/student/{id}" , method = RequestMethod.PUT)
	public String updateStudent(@PathVariable Long id,@RequestBody Student student){
		service.updateStudent(id, student);
		return "Student===="+student.getName()+"---data updated";
	}
	@RequestMapping(value="/student/delete/{id}" , method = RequestMethod.DELETE)
	public String delleteStudent(@PathVariable Long id){
		service.delleteStudent(id);
		return "Deleted";
	}
}
