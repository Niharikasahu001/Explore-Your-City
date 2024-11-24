package com.student.ExploreYourCity.service;

import com.student.ExploreYourCity.dao.HospitalRepository;
import com.student.ExploreYourCity.dao.HostelsRepository;
import com.student.ExploreYourCity.dao.RestaurantRepository;
import com.student.ExploreYourCity.entities.Hospital;
import com.student.ExploreYourCity.entities.Hostels;
import com.student.ExploreYourCity.entities.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    HospitalRepository hospitalRepository;

    @Autowired
    HostelsRepository hostelsRepository;

    public List<Restaurant> getAllRestaurants()
    {
        return this.restaurantRepository.findAll();
    }

    public List<Hospital> getAllHospitals()
    {
        return this.hospitalRepository.findAll();
    }

    public List<Hostels> getAllHostels()
    {
        return this.hostelsRepository.findAll();
    }
}
