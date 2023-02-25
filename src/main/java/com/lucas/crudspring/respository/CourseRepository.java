package com.lucas.crudspring.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.crudspring.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    
}
