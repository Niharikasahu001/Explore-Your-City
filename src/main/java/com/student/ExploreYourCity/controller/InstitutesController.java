package com.student.ExploreYourCity.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.ExploreYourCity.dao.CityRepository;
import com.student.ExploreYourCity.entities.Institutes;
import com.student.ExploreYourCity.entities.User;
import com.student.ExploreYourCity.service.InstitutesService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/institutes")
public class InstitutesController {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    InstitutesService institutesService;
    @RequestMapping(value="/college", method= RequestMethod.GET)
    public String Institutes(Model model, HttpSession session, HttpServletRequest request)
    {
        model.addAttribute("title","Institutes -city guide for student");
        User cu = (User) session.getAttribute("current-user");
        System.out.println(cu);
        model.addAttribute(cu);
        System.out.println(cu.getCity());
        String userCity = cu.getCity();
        model.addAttribute("cities", institutesService.getAllCity());
        System.out.println("city----"+institutesService.getAllCity());

        model.addAttribute("states", institutesService.getAllState());
        System.out.println("state----"+institutesService.getAllState());
        model.addAttribute("institutes", institutesService.getAllInstitutes());
        System.out.println("Institutes----"+institutesService.getAllInstitutes());
        model.addAttribute("courses", institutesService.getAllCourses());
        System.out.println("Courses----"+institutesService.getAllCourses());
        model.addAttribute("courseFee", institutesService.getAllCourseFee());
        System.out.println("CourseFee----"+institutesService.getAllCourseFee());

        return "Institutes";
    }


    @RequestMapping(value="/getStates/{stateCode}", method = RequestMethod.GET)
    public @ResponseBody String getStates(@PathVariable String stateCode)
    {

        String json = null;
        List<Object[]> list = cityRepository.getCitiesByStateCode(stateCode);
        try {
            json = new ObjectMapper().writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    @RequestMapping(value="/alluni", method = RequestMethod.GET)
    @ResponseBody
    public List<Institutes> InstitutesFilterByState()
    {
        return this.institutesService.getAllInstitutes();
    }


//    Method to add Institutes in database through json
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String registerUser(@RequestBody() Institutes institutes, BindingResult result, Model model, HttpSession session) {
        System.out.println(institutes);
        this.institutesService.saveInstitutes(institutes);
        return "successfull";
    }


}
