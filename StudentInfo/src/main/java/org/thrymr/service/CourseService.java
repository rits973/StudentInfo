package org.thrymr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thrymr.model.CourseRepository;
import org.thrymr.model.Courses;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Courses> getAllCourses(Long studentId){
	List<Courses> courses = new ArrayList<>();
	courseRepository.getCoursesById(studentId).forEach(courses::add);
	System.out.println(courses.size()+"----------");
	return courses;
	}

	public void addCourse(Courses course) {
		courseRepository.save(course);
		return ;
	}

	public void updateCourse(Long cId, Courses course) {
		// TODO Auto-generated method stub
		
	}

	public void delleteCourse(Long cId) {
		// TODO Auto-generated method stub
		
	}
}
