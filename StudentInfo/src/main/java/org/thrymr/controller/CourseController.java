package org.thrymr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.thrymr.model.Courses;
import org.thrymr.model.Student;
import org.thrymr.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	
	@RequestMapping(value="/student/{studentId}/courses",method = RequestMethod.GET)
	public List<Courses> getAllCourses(@PathVariable Long studentId){
		return courseService.getAllCourses(studentId);
	}
	@RequestMapping(value="/student/{studentId}/courses" , method = RequestMethod.POST)
	public String addStudent(@RequestBody Courses course,@PathVariable Long studentId){
		course.setStudent(new Student(studentId,"",""));
		courseService.addCourse(course);
		return "Courses Added";
	}
	@RequestMapping(value="/student/{sId}/courses/{cId}" , method = RequestMethod.PUT)
	public String updateStudent(@PathVariable Long sid,@PathVariable Long cId,@RequestBody Courses course){
		courseService.updateCourse(cId, course);
		return "Couser Updated";
	}
	@RequestMapping(value="/student/{sId}/courses/{cId}" , method = RequestMethod.DELETE)
	public String delleteStudent(@PathVariable Long sId,@PathVariable Long cId){
		courseService.delleteCourse(cId);
		return "Deleted";
	}
}
