package com.student.ExploreYourCity.dao;

import com.student.ExploreYourCity.entities.City;
import com.student.ExploreYourCity.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
//    List<City> findAllByStateCode(String stateCode);

    List<City> findAll();
    @Query("SELECT c FROM City c JOIN c.state s WHERE s.stateCode = :stateCode")
    List<Object[]> getCitiesByStateCode(String stateCode);


}
