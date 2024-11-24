package com.student.ExploreYourCity.controller;

import com.student.ExploreYourCity.dao.UserRepository;
import com.student.ExploreYourCity.entities.User;
import com.student.ExploreYourCity.service.InstitutesService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/eyc")
@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private InstitutesService institutesService;
    @RequestMapping("/check")
    public String check(Model model)
    {
        model.addAttribute("title","Home -city guide for student");
        System.out.println("check");
        model.addAttribute("university", institutesService.getAllInstitutes());
        model.addAttribute("state", institutesService.getAllState());

        System.out.println(model.getAttribute("university"));
        return "check";
    }

    @RequestMapping("/home")
    public String home(Model model, HttpSession session)
    {
        model.addAttribute("title","Home -city guide for student");
        User user = (User) session.getAttribute("current-user");
        System.out.println(user);
        model.addAttribute(user);

        System.out.println("homie");
        return "home";
    }

    @RequestMapping("/notification")
    public String notification(Model model)
    {
        model.addAttribute("title","Notification -city guide for student");
        System.out.println("notification");
        return "notification";
    }

    @RequestMapping("/logout")
    public String logout(Model model,HttpSession session)
    {
        model.addAttribute("title","Home -city guide for student");
        session.removeAttribute("current-user");
        session.removeAttribute("user");
        System.out.println("logout");
        return "redirect:/eyc/home";
    }

    @RequestMapping("/profile")
    public String profile(Model model, HttpSession session)
    {
        model.addAttribute("title","Profile -city guide for student");
        User user = (User) session.getAttribute("current-user");
        System.out.println(user);
        model.addAttribute("user",user);
        System.out.println("Profile");
//        UserDto u1 = new UserDto();
//        model.addAttribute("u1",u1);
        return "profile";
    }

    @RequestMapping("/services")
    public String services(Model model)
    {
        model.addAttribute("title","Services -city guide for student");
        System.out.println("services");
        return "services";
    }

    @RequestMapping("/discover")
    public String discover(Model model,HttpSession session) {
        model.addAttribute("title", "Discover -city guide for student");
        model.addAttribute("states", institutesService.getAllState());
        model.addAttribute("title", "Home -city guide for student");
        User user = (User) session.getAttribute("current-user");
        System.out.println(user);
        model.addAttribute(user);
        return "discover";
    }

    @RequestMapping("/contactus")
    public String contactus(Model model)
    {
        model.addAttribute("title","Contact Us -city guide for student");
        System.out.println("contactus");
        return "contactus";
    }


//   Handler for registering user

//    @RequestMapping(value="/do_register",method = RequestMethod.POST)
//    public String registerUser(@ModelAttribute("user") User user, Model model, HttpSession session)
//    {
//        try
//        {
////            if(user.getName())
////            {
////                System.out.println("You have not agreed the terms and conditions");
////                throw new Exception("The user already exists");
////            }
//            System.out.println(user.getName());
//            System.out.println(user.getEmail());
//            System.out.println(user.getPassword());
//            user.setRole("student");
//            user.setEnabled(true);
//            user.setImageUrl("default.png");
//            System.out.println(user);
//
//            User result = this.userRepository.save(user);
//            model.addAttribute("user",new User());
//            session.setAttribute("message", new Message("Successfully Registered !!","alert-success"));
//
////        model.addAttribute("user",user);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            model.addAttribute("user",user);
//            session.setAttribute("message", new Message("Something went wrong !!" +e.getMessage(),"alert-danger"));
//        }
//        return "registration";
//    }



}
