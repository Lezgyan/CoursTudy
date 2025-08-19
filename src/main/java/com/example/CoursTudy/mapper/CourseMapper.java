package com.example.CoursTudy.mapper;


import com.example.CoursTudy.dto.CourseUpdate;
import com.example.CoursTudy.entity.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface CourseMapper {

//    CourseUpdate toCourseUpdate(Course course);

    Course toCourse(CourseUpdate courseUpdate);

}
