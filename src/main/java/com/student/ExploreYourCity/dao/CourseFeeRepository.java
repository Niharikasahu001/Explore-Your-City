package com.student.ExploreYourCity.dao;

import com.student.ExploreYourCity.entities.CourseFee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseFeeRepository extends JpaRepository<CourseFee, Integer> {
    List<CourseFee> findAll();
}
