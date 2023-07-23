package com.springcrud.springcrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.springcrud.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    
}
