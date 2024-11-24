package com.student.ExploreYourCity.dao;

import com.student.ExploreYourCity.entities.Hospital;
import com.student.ExploreYourCity.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
    List<Restaurant> findAll();

    @Query(value = "SELECT * FROM Restaurant ORDER BY RAND() LIMIT 4", nativeQuery = true)
    List<Restaurant> findRandomFourRestaurant();
}
