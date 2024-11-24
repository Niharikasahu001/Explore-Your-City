package com.student.ExploreYourCity.controller;

import com.student.ExploreYourCity.UserDto;
import com.student.ExploreYourCity.entities.User;
import com.student.ExploreYourCity.helper.Message;
import com.student.ExploreYourCity.service.InstitutesService;
import com.student.ExploreYourCity.service.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @Autowired
    private InstitutesService institutesService;

    @RequestMapping("/index")
    public String index(Model model)
    {
        model.addAttribute("title","Index -city guide for student");
        System.out.println("index");
        return "index";
    }


    @RequestMapping("/about")
    public String about(Model model)
    {
        model.addAttribute("title","About -city guide for student");
        System.out.println("about");
        return "about";
    }

    @RequestMapping("/rough")
    public String rough(Model model)
    {
        model.addAttribute("title","rough -city guide for student");
        System.out.println("rough");
        return "rough";
    }


    @RequestMapping("/signup")
    public String signup(Model model)
    {
        model.addAttribute("title","Register -city guide for student");
        model.addAttribute("user",new User());
        System.out.println("signup");
        return "registration";
    }

    @RequestMapping("/signin")
    public String signin(Model model)
    {
        model.addAttribute("title","Login -city guide for student");
        System.out.println("signin");
        return "login";
    }

//    @ResponseBody
    @RequestMapping(value = "/do_register", method = RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") UserDto userDto, BindingResult result, Model model, HttpSession session) {
        if (result.hasErrors()) {
            System.out.println("I have got an error");
            System.out.println(result);
            return "registration";
        } else {
            System.out.println(userDto.getName());
            System.out.println(userDto.getEmail());
            System.out.println(userDto.getPassword());
            System.out.println(userDto);
            this.userService.saveUser(userDto);
//            return "redirect:/eyc/home";
//            return "Successfull";
            return "redirect:/signin";
        }
    }

    @RequestMapping(value = "/do_login", method = RequestMethod.POST)
    public String login(@Valid @RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, Model model) {
        User user = userService.loginUser(email, password);
        if (user != null) {
            model.addAttribute("user", user);
            session.setAttribute("message", new Message("logout Successfull!!", "alert-success"));
            session.setAttribute("current-user", user);
            session.setAttribute("user", user);
            Boolean loggedIn = true;
//            System.out.println(loggedIn);
//            model.addAttribute("loggedIn", loggedIn);
            return "redirect:/eyc/home";
        } else {
            session.setAttribute("message", new Message("Invalid Email Id or Password !!", "alert-danger"));
            return "redirect:/signin";
        }

    }

    @RequestMapping("/home")
    public String home(Model model, HttpSession session)
    {
        model.addAttribute("title","Home -city guide for student");
        System.out.println("pre-home");
        return "home";
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
        return "discover";
    }

}
