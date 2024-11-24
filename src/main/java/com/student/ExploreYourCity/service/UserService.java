package com.student.ExploreYourCity.service;

//import com.student.ExploreYourCity.UserDto;
import com.student.ExploreYourCity.UserDto;
import com.student.ExploreYourCity.dao.UserRepository;
import com.student.ExploreYourCity.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers()
    {
        return (List<User>) this.userRepository.findAll();
    }

    public long saveUser(UserDto user)
    {
        user.setRole("student");
        user.setEnabled(true);
        user.setImageUrl("image.jpg");
        User user1 = new User(user);
        this.userRepository.save(user1);
        return user1.getId();
    }

    public User updateUser(UserDto userDto, Integer userId, String imageID) {
        Optional<User> optionalUser = this.userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setName(userDto.getName());
            user.setEmail(userDto.getEmail());
            user.setPassword(userDto.getPassword());
            user.setRole("normal");
            user.setEnabled(true);
            user.setImageUrl(imageID);
            user.setCity(userDto.getCity());

            User updatedUser = this.userRepository.save(user);
            System.out.println(updatedUser);
            return updatedUser;
        }

        return new User();
    }

    public User loginUser(String email, String password)
    {
        System.out.println(email+ " "+password);
        User user = this.userRepository.findByEmailAndPassword(email, password);
//        if(user!=null)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//        System.out.println(user);
        return user;
    }
//    delete
    public void removeUserById(Integer id)
    {
        userRepository.deleteById(id);
    }

//    update
    public Optional<User> getUserById(Integer id)
    {
        return userRepository.findById(id);
    }




}
