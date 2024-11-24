package com.student.ExploreYourCity.entities;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
public class Hostels {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="hostel_name")
    private String name;
    @Column(name="hostel_address")
    private String address;
    @Column(name="hostel_contact")
    private BigInteger contact;
    @Column(name="hostel_price")
    private Integer price;

    @Column(name="image")
    private String image;

//    @Column(name="state_code")
//    private State stateCode;

    public Hostels() {
    }

    public Hostels(String name, String address, Integer rating, BigInteger contact, Integer price, String image) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.price = price;
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
        address = address;
    }

    public BigInteger getContact() {
        return contact;
    }

    public void setContact(BigInteger contact) {
        this.contact = contact;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Hostels{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
