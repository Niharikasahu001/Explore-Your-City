package com.student.ExploreYourCity.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="state_id")
    private Integer stateId;
    @Column(name="state_name")
    private String stateName;

    @Column(name="state_code")
    private String stateCode;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<City> cities;

    public State() {
    }

    public State(Integer stateId, String stateName, Set<City> cities, String stateCode) {
        this.stateId = stateId;
        this.stateName = stateName;
        this.cities = cities;
        this.stateCode =stateCode;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateId=" + stateId +
                ", stateName='" + stateName + '\'' +
                ", stateCode='" + stateCode + '\'' +
                ", cities=" + cities +
                '}';
    }
}
