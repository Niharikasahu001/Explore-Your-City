package com.student.ExploreYourCity.dao;

import com.student.ExploreYourCity.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
    List<State> findAll();
//    @Query("SELECT c.id,c.name FROM State s JOIN s.cities AS c WHERE s.id=:id")
//    List<Object[]> getCitiesByState(String stateCode);

    public List<State> findByStateNameContaining(String keywords);
}
