package com.student.ExploreYourCity.dao;

import com.student.ExploreYourCity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
    User findByEmailAndPassword(String email, String password);
}
