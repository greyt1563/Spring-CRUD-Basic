package com.springcrud.springcrud.services;

import java.util.List;

import com.springcrud.springcrud.entity.Course;

public interface CourseService {

    public List<Course> getCourses();
    
    public Course getCourseById(long courseID);

    public Course addCourse(Course course);
    
    public List<Course> updateCourse(Course course);
    
    public List<Course> deleteCourse(long courseID);
}
