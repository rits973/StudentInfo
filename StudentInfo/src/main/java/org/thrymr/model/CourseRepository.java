package org.thrymr.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Courses, Long>{

	public List<Courses> getCoursesById(Long sId);
}
