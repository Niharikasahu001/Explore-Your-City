package com.student.ExploreYourCity.entities;

import jakarta.persistence.*;


@Entity
public class Hospital {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;
    @Column(name="contact")
    private Double contact;
    @Column(name="timing")
    private String timing;

    @Column(name="image")
    private String image;

    public Hospital() {
    }

    public Hospital(String name, String address, Double contact, String timing, String image) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.timing = timing;
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

    public Double getContact() {
        return contact;
    }

    public void setContact(Double contact) {
        this.contact = contact;
    }

    public String getTiming() {
        return timing;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                ", timing='" + timing + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
