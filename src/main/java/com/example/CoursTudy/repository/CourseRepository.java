package com.example.CoursTudy.repository;


import com.example.CoursTudy.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CourseRepository extends JpaRepository<Course, UUID> {
    @Query("select c from Course c where c.title like concat(:prefix, '%')")
    List<Course> findByTitleStartingWith(String prefix);
}
