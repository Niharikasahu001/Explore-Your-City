package com.student.ExploreYourCity.controller;

import com.student.ExploreYourCity.entities.State;
import com.student.ExploreYourCity.entities.User;
import com.student.ExploreYourCity.service.InstitutesService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/eyc/discover")
@Controller
public class DiscoverController {

    @Autowired
    InstitutesService InstitutesService;

    @RequestMapping("/state")
    public String state(@RequestParam("query") String query, Model model, HttpSession session)
    {
        model.addAttribute("title","Discover States -city guide for student");
        System.out.println("***********"+query);
        model.addAttribute("InstitutesByState", InstitutesService.getFindRandom4(query));
        model.addAttribute("HostelsByState", InstitutesService.getFindRandom4());
        model.addAttribute("HospitalsByState", InstitutesService.getFindRandomHospital());
        model.addAttribute("RestaurantsByState", InstitutesService.getFindRandomRestaurant());
        System.out.println("=================================================================="+InstitutesService.getFindRandom4(query));
        System.out.println("=================================================================="+InstitutesService.getFindRandom4());
        System.out.println("=================================================================="+InstitutesService.getFindRandomHospital());
        System.out.println("=================================================================="+InstitutesService.getFindRandomRestaurant());
        model.addAttribute("title","State -city guide for student");
        User user = (User) session.getAttribute("current-user");
        System.out.println(user);
        model.addAttribute(user);
        return "state";
    }


}
