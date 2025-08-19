package com.example.CoursTudy.controller;

import com.example.CoursTudy.dto.CourseUpdate;
import com.example.CoursTudy.entity.Course;
import com.example.CoursTudy.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/all")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getById(@PathVariable UUID id){
        return courseService.getCourseById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id){
        courseService.deleteById(id);
    }

    @PostMapping
    public void update(@RequestBody CourseUpdate courseUpdate){
        courseService.save(courseUpdate);
    }

}
