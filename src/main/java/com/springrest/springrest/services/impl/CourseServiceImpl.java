package com.springrest.springrest.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.inter.CourseRepository;
import com.springrest.springrest.services.CourseService;

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
