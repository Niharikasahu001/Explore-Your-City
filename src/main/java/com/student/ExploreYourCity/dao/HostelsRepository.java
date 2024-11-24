package com.student.ExploreYourCity.dao;

import com.student.ExploreYourCity.entities.Hostels;
import com.student.ExploreYourCity.entities.Institutes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HostelsRepository extends JpaRepository<Hostels, Integer> {
    List<Hostels> findAll();

    @Query(value = "SELECT * FROM Hostels ORDER BY RAND() LIMIT 4", nativeQuery = true)
    List<Hostels> findRandomFour();
}
