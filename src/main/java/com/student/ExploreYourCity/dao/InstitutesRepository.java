package com.student.ExploreYourCity.dao;

import com.student.ExploreYourCity.entities.Institutes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InstitutesRepository extends JpaRepository<Institutes, Integer> {
//    University findByState(String state);
    List<Institutes> findAllByState(String state);
    List<Institutes> findAllByCity(String city);
    @Query(value = "SELECT * FROM institutes WHERE state_code = :stateCode ORDER BY RAND() LIMIT 4", nativeQuery = true)
    List<Institutes> findRandomFour(@Param("stateCode") String stateCode);

    Optional<Institutes> findById(Integer id);

    //search
    public List<Institutes> findByNameContaining(String keywords);




}
