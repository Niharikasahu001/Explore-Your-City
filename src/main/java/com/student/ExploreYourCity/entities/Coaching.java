package com.student.ExploreYourCity.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Coaching {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="coaching_name")
    private String name;
    @Column(name="coaching_address")
    private String address;
    @Column(name="coaching_courses")
    private String courses;
    @Column(name="coaching_timing")
    private LocalDateTime timing;
    @Column(name="coaching_ratings")
    private Integer ratings;
    @Column(name="coaching_fee")
    private Integer feeStructure;

    public Coaching() {
    }

    public Coaching(String name, String address, String courses, LocalDateTime timing, Integer ratings, Integer feeStructure) {
        this.name = name;
        this.address = address;
        this.courses = courses;
        this.timing = timing;
        this.ratings = ratings;
        this.feeStructure = feeStructure;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public LocalDateTime getTiming() {
        return timing;
    }

    public void setTiming(LocalDateTime timing) {
        this.timing = timing;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    public Integer getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Integer feeStructure) {
        this.feeStructure = feeStructure;
    }

    @Override
    public String toString() {
        return "Coaching{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", courses=" + courses +
                ", timing=" + timing +
                ", ratings=" + ratings +
                ", feeStructure=" + feeStructure +
                '}';
    }
}
