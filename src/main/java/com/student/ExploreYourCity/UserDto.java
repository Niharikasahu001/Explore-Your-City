package com.student.ExploreYourCity;

import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public class UserDto {

    @NotEmpty(message = "Cannot be Empty!!")
    @Size(min = 5, message = "Username must be contain atleast 5 characters!!")
    @Pattern(regexp = "^[A-Za-z]\\w{5,29}$", message = "Invalid Username")
    private String name;
//    @Email(regexp = "^[A-Za-z0-9._%+-]+@(gmail\\.com|yahoo\\.com|outlook\\.com)$",message = "Invalid Email Address!!")
    @Pattern(regexp = "^[A-Za-z]+[A-Za-z0-9._%+-]+@(?:gmail|yahoo|outlook)\\.(?:com|net|org)$",message = "Invalid Email Address!!")
    private String email;
    @NotEmpty(message = "Cannot be Empty")
    @Size(min=8, max=16, message = "The password must be 8-16 characters long")
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W]).{6,20})", message = "Password must contain special symbol")
    private String password;
    private String role;
    private boolean enabled;
    private String imageUrl;
    private String city;

    public UserDto() {
    }

    public UserDto(String name, String email, String password, String role, boolean enabled, String imageUrl, String city) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
        this.imageUrl = imageUrl;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
