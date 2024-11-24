package com.student.ExploreYourCity.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Events {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="event_venue")
    private String venue;
    @Column(name="event_type")
    private String type;
    @Column(name="event_LocalDateTime")
    private LocalDateTime LocalDateTime;
    @Column(name="event_date")
    private Date date;

    public Events() {
    }

    public Events(String venue, String type, java.time.LocalDateTime LocalDateTime, Date date) {
        this.venue = venue;
        this.type = type;
        this.LocalDateTime = LocalDateTime;
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getLocalDateTime() {
        return LocalDateTime;
    }

    public void setLocalDateTime(LocalDateTime LocalDateTime) {
        this.LocalDateTime = LocalDateTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Events{" +
                "venue='" + venue + '\'' +
                ", type='" + type + '\'' +
                ", LocalDateTime=" + LocalDateTime +
                ", date=" + date +
                '}';
    }
}
