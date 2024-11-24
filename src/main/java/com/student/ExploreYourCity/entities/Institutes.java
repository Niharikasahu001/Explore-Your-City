package com.student.ExploreYourCity.entities;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Institutes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="institute_id")
    private Integer id;

//    @Column(name="institute_id")
//    private String instituteId;

    @Column(name="Institute_name")
    private String name;
    @Column(name="Institute_address")
    private String address;
    @ManyToMany
    private Set<Courses> courses;
    @Column(name="Institute_state")
    private String state;

    @Column(name="state_code")
    private String stateCode;
    @Column(name="Institute_city")
    private String city;

    @Column(name="city_id")
    private Integer cityID;
    @Column(name="image")
    private String image;


    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    public Institutes() {
        super();
    }

    public Institutes(Institutes institutes)
    {
       this.id = institutes.getId();
       this.name = institutes.getName();
       this.address = institutes.getAddress();
       this.courses = institutes.getCourses();
       this.state = institutes.getState();
       this.city = institutes.getCity();
       this.stateCode = institutes.getStateCode();
       this.cityID = institutes.getCityID();
       this.university = institutes.getUniversity();
       this.image = institutes.getImage();
    }

    public Institutes(Integer id, String name, String address, Set<Courses> courses, String state, String city, String stateCode, Integer cityID, University university, String image ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.courses = courses;
        this.state = state;
        this.city = city;
        this.stateCode = stateCode;
        this.cityID = cityID;
        this.university = university;
        this.image = image;
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

    public Set<Courses> getCourses() {
        return courses;
    }

    public void setCourses(Set<Courses> courses) {
        this.courses = courses;
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

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Institutes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", courses=" + courses +
                ", state='" + state + '\'' +
                ", stateCode='" + stateCode + '\'' +
                ", city='" + city + '\'' +
                ", cityID=" + cityID +
                ", image='" + image + '\'' +
                ", university=" + university +
                '}';
    }
}
