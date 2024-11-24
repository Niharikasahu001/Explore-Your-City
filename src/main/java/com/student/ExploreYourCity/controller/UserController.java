package com.student.ExploreYourCity.controller;

import com.student.ExploreYourCity.UserDto;
import com.student.ExploreYourCity.entities.User;
import com.student.ExploreYourCity.helper.Message;
import com.student.ExploreYourCity.service.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//@RequestMapping("/user")
@Controller
public class UserController {
    private static String uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/user";
      @Autowired
    UserService userService;

    @GetMapping("/users")
    @ResponseBody
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @RequestMapping(value = "/update", method=RequestMethod.POST)
    public String userUpdate(@Valid @ModelAttribute("user") UserDto userDto,
                             BindingResult result,
                             @RequestParam("userImage")MultipartFile file,
                             @RequestParam("imgName")String imgName,
                             HttpSession session,Model model) throws IOException {
        User currentUser = (User) session.getAttribute("current-user");
        Integer userID = currentUser.getId();
//        UserDto uu = new UserDto();
        if (result.hasErrors()) {
            System.out.println("I have got an error");
            System.out.println(result);
        } else {
            String imageID;
            if (!file.isEmpty())
            {
                imageID = file.getOriginalFilename();
                Path fileNameAndPath = Paths.get(uploadDir, imageID);
                Files.write(fileNameAndPath, file.getBytes());
            }
            else
            {
                imageID = imgName;
            }
//            uu.setImageUrl(imageID);
            System.out.println(userDto);
            this.userService.updateUser(userDto, userID, imageID);
        }
        return "profile";
    }

//    @RequestMapping(value ="/update", method = RequestMethod.POST)
//    public String updateUserGet(@Valid @ModelAttribute("user") UserDto userDto, BindingResult result, Model model, HttpSession session)
//    {
//        User currentUser = (User) session.getAttribute("current-user");
//        Integer userID = currentUser.getId();
////        UserDto userDto = new UserDto();
//
//        if (result.hasErrors()) {
//            System.out.println("I have got an error");
//            System.out.println(result);
//        } else {
//            System.out.println(userDto);
//            this.userService.updateUser(userDto, userID);
//        }
//
//        return "profile";
//    }

}