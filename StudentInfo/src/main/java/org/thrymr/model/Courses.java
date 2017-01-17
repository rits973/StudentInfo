package org.thrymr.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Courses {
	
	@Id
	private Long id;
	
	private String courseName;
	
	private String courseCode;
	
	@ManyToOne
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	
	public Courses() {
		super();
	}


	public Courses(Long id, String courseName, String courseCode, String price,Long studentId) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.price = price;
		this.student=new Student(studentId,"","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	private String price;
	

}
