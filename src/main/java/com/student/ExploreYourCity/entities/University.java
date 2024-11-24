package com.student.ExploreYourCity.entities;

import jakarta.persistence.*;

@Entity
public class University {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="university_id")
    private Integer id;

//    @Column(name="university_id")
//    private String universityId;
    @Column(name="university_name")
    private String name;
    @Column(name="university_state")
    private String state;
    @Column(name="university_city")
    private String city;

    public University() {
    }

    public University(Integer id, String name, String state, String city) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.city = city;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
