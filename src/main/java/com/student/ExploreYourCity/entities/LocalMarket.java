package com.student.ExploreYourCity.entities;

import jakarta.persistence.*;

@Entity
public class LocalMarket {
    @Id
    @Column(name="id", length = 100)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="market_name")
    private String name;
    @Column(name="market_venue")
    private String venue;
    @Column(name="market_rating")
    private Integer rating;

    public LocalMarket() {
    }

    public LocalMarket(String name, String venue, Integer rating) {
        this.name = name;
        this.venue = venue;
        this.rating = rating;
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

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "LocalMarket{" +
                "name='" + name + '\'' +
                ", venue='" + venue + '\'' +
                ", rating=" + rating +
                '}';
    }
}
