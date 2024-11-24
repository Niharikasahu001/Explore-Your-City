package com.student.ExploreYourCity.dao;

import com.student.ExploreYourCity.entities.Hospital;
import com.student.ExploreYourCity.entities.Hostels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
    List<Hospital> findAll();

    @Query(value = "SELECT * FROM Hospital ORDER BY RAND() LIMIT 4", nativeQuery = true)
    List<Hospital> findRandomFourHospital();
}
