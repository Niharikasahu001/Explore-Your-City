package com.student.ExploreYourCity.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class Restaurant {
    @Id
    @Column(name="id", length = 100)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="restaurant_name")
    private String name;
    @Column(name="restaurant_type")
    private String type;
    @Column(name="meal_type")
    private String mealType;
    @Column(name="restaurant_venue")
    private String venue;
    @Column(name="image_url")
    private String image;

    public Restaurant() {
    }

    public Restaurant(String name, String type, String venue, String image, String mealType) {
        this.name = name;
        this.type = type;
        this.venue = venue;
        this.image = image;
        this.mealType = mealType;
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

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", mealType='" + mealType + '\'' +
                ", venue='" + venue + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
