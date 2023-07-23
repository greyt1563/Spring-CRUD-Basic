package com.springcrud.springcrud.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.springcrud.entity.Course;
import com.springcrud.springcrud.repo.CourseRepository;
import com.springcrud.springcrud.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {


    @Autowired
    private CourseRepository courseRepository;

    public CourseServiceImpl() {

    }

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(long courseID) {
        return courseRepository.findById(courseID).get();
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> updateCourse(Course course) {

        if(courseRepository.findById(course.getId()) != null){
            courseRepository.save(course);
        }

        return courseRepository.findAll();
    }

    @Override
    public List<Course> deleteCourse(long courseID) {
        Optional<Course> entity = courseRepository.findById(courseID);
        courseRepository.delete(entity.get());
        return courseRepository.findAll();
    }
    
}
