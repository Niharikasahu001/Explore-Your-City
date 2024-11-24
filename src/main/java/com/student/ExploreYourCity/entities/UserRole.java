package com.student.ExploreYourCity.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserRole {
    @Id
    private Integer userId;
    @Column(name="user_role")
    private String userRole;

    public UserRole() {
    }

    public UserRole(Integer userId, String userRole) {
        this.userId = userId;
        this.userRole = userRole;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userId='" + userId + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
