package com.student.ExploreYourCity.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Library {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="library_name")
    private String name;
    @Column(name="library_type")
    private String type;
    @Column(name="library_address")
    private String address;
    @Column(name="library_timing")
    private LocalDateTime timing;

    public Library() {
    }

    public Library(String name, String type, String address, LocalDateTime timing) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.timing = timing;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getTiming() {
        return timing;
    }

    public void setTiming(LocalDateTime timing) {
        this.timing = timing;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", timing=" + timing +
                '}';
    }
}
