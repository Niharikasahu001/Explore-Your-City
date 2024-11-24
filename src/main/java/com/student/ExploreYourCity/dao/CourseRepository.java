package com.student.ExploreYourCity.dao;

import com.student.ExploreYourCity.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Integer> {
    List<Courses> findAll();
}
