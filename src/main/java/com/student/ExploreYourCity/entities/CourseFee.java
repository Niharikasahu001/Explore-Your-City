package com.student.ExploreYourCity.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "course_fee")
public class CourseFee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses course;

    @ManyToOne
    @JoinColumn(name = "institute_id")
    private Institutes institutes;

    @Column(name = "fee")
    private double fee;

    public CourseFee() {
    }

    public CourseFee(Courses course, Institutes institutes, double fee) {
        this.course = course;
        this.institutes = institutes;
        this.fee = fee;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Institutes getUniversity() {
        return institutes;
    }

    public void setUniversity(Institutes institutes) {
        this.institutes = institutes;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}