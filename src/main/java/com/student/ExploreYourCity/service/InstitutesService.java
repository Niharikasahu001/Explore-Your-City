package com.student.ExploreYourCity.service;

import com.student.ExploreYourCity.dao.*;
import com.student.ExploreYourCity.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutesService {
    @Autowired
    InstitutesRepository institutesRepository;
    @Autowired
    StateRepository stateRepository;

    @Autowired
    CourseFeeRepository courseFeeRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CityRepository cityRepository;

    @Autowired
    HostelsRepository hostelsRepository;

    @Autowired
    HospitalRepository hospitalRepository;

    @Autowired
    RestaurantRepository restaurantRepository;


    public List<Institutes> getAllInstitutes()
    {
        List<Institutes> all = this.institutesRepository.findAll();
//        System.out.println(all);
        return all;
    }

    public List<Institutes> getAllInstitutesByState(String state)
    {
        return this.institutesRepository.findAllByState(state);
    }

    public List<Institutes> getAllInstitutesByCity(String city)
    {
        return this.institutesRepository.findAllByCity(city);
    }

    public List<State> getAllState()
    {
        return this.stateRepository.findAll();
    }
    public List<City> getAllCity()
    {
        return this.cityRepository.findAll();
    }
    public List<Courses> getAllCourses() {return this.courseRepository.findAll();}
    public List<CourseFee> getAllCourseFee() {return this.courseFeeRepository.findAll();}
    public List<Institutes> getFindRandom4(String stateCode) {return this.institutesRepository.findRandomFour(stateCode);}
    public List<Hostels> getFindRandom4() {return this.hostelsRepository.findRandomFour();}
    public List<Hospital> getFindRandomHospital() {return this.hospitalRepository.findRandomFourHospital();}
    public List<Restaurant> getFindRandomRestaurant() {return this.restaurantRepository.findRandomFourRestaurant();}


//    hey


    public List<Object[]> getCitiesByStateCode(String stateCode){
        return cityRepository.getCitiesByStateCode(stateCode);
    }


    public long saveInstitutes(Institutes institutes)
    {
        Institutes institutes1 = new Institutes(institutes);
        this.institutesRepository.save(institutes1);
        return institutes1.getId();
    }


}
