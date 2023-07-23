package com.springrest.springrest.inter;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    
}
