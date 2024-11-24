package com.student.ExploreYourCity.controller;

import com.student.ExploreYourCity.entities.Restaurant;
import com.student.ExploreYourCity.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("/eyc/services")
@Controller
public class ServicesController {

    @Autowired
    ServicesService servicesService;
    @RequestMapping("/banks")
    public String banks(Model model)
    {
        model.addAttribute("title","Banks -city guide for student");
        System.out.println("bank");
        return "banks";
    }

    @RequestMapping("/buses")
    public String buses(Model model)
    {
        model.addAttribute("title","Buses -city guide for student");
        System.out.println("buses");
        return "buses";
    }

    @RequestMapping("/hospital")
    public String hospital(Model model)
    {
        model.addAttribute("title","Hospital -city guide for student");
        model.addAttribute("hospital", this.servicesService.getAllHospitals());
        System.out.println(this.servicesService.getAllHospitals());
        System.out.println("hospital");
        return "hospital";
    }

    @RequestMapping("/hostels")
    public String hostels(Model model)
    {
        model.addAttribute("title","Hostels -city guide for student");
        model.addAttribute("hostels", this.servicesService.getAllHostels());
        System.out.println(this.servicesService.getAllHostels());
        System.out.println("hostels");
        return "hostels";
    }

    @RequestMapping("/hotel")
    public String hotel(Model model)
    {
        model.addAttribute("title","Hotel -city guide for student");
        System.out.println("hotel");
        return "hotel";
    }


    @RequestMapping("/library")
    public String library(Model model)
    {
        model.addAttribute("title","Library -city guide for student");
        System.out.println("library");
        return "library";
    }

    @RequestMapping("/local")
    public String local(Model model)
    {
        model.addAttribute("title","Local Itenaries -city guide for student");
        System.out.println("local");
        return "local";
    }

    @RequestMapping("/events")
    public String events(Model model)
    {
        model.addAttribute("title","Events -city guide for student");
        System.out.println("events");
        return "events";
    }

    @RequestMapping("/museums")
    public String museums(Model model)
    {
        model.addAttribute("title","museums -city guide for student");
        System.out.println("museums");
        return "museums";
    }

    @RequestMapping("/rental")
    public String rental(Model model)
    {
        model.addAttribute("title","Rental Houses -city guide for student");
        System.out.println("rental");
        return "rental";
    }

    @RequestMapping("/restaurants")
    public String restaurants(Model model)
    {
        List<Restaurant> restaurant = this.servicesService.getAllRestaurants();
        model.addAttribute("restaurant", restaurant);
        System.out.println(restaurant);
        model.addAttribute("title","Restaurants -city guide for student");
        System.out.println("restaurants");
        return "restaurants";
    }
}
