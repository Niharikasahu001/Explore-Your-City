package com.student.ExploreYourCity.entities;

import jakarta.persistence.*;

import java.util.Set;


@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="course_id")
    private Integer courseId;
    @Column(name="course_name")
    private String courseName;
//    private Set<University> universities;

    public Courses() {
        super();
    }

    public Courses(Integer courseId, String courseName,Set<Institutes> universities) {
        this.courseId = courseId;
        this.courseName = courseName;
//        this.universities = universities;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

//    public Set<University> getUniversities() {
//        return universities;
//    }

//    public void setUniversities(Set<University> universities) {
//        this.universities = universities;
//    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
