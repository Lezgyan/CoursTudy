package com.example.CoursTudy.service;

import com.example.CoursTudy.dto.CourseUpdate;
import com.example.CoursTudy.entity.Course;
import com.example.CoursTudy.mapper.CourseMapper;
import com.example.CoursTudy.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CourseService {
    private final CourseRepository courseRepository;

    private final CourseMapper courseMapper;

    public CourseService(CourseRepository courseRepository, CourseMapper courseMapper) {
        this.courseRepository = courseRepository;
        this.courseMapper = courseMapper;
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseById(UUID uuid){
        return courseRepository.findById(uuid).orElse(null);
    }

    public void deleteById(UUID uuid){
        courseRepository.deleteById(uuid);
    }

    public void save(CourseUpdate courseUpdate){

        courseRepository.save(courseMapper.toCourse(courseUpdate));
    }
}
