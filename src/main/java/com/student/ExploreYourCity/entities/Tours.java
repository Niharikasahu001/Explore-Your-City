package com.student.ExploreYourCity.entities;

import jakarta.persistence.*;

@Entity
public class Tours {
    @Id
    @Column(name="id", length = 100)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="tour_map")
    private String map;
    @Column(name="tour_venue")
    private String Venue;
    @Column(name="tour_planning")
    private String planning;
    @Column(name="tour_hours")
    private Integer hours;

    public Tours() {
    }

    public Tours(String map, String venue, String planning, Integer hours) {
        this.map = map;
        Venue = venue;
        this.planning = planning;
        this.hours = hours;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String venue) {
        Venue = venue;
    }

    public String getPlanning() {
        return planning;
    }

    public void setPlanning(String planning) {
        this.planning = planning;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Tours{" +
                "map='" + map + '\'' +
                ", Venue='" + Venue + '\'' +
                ", planning='" + planning + '\'' +
                ", hours=" + hours +
                '}';
    }
}
