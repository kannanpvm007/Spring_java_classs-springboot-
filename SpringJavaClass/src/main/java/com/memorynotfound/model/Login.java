package com.memorynotfound.model;

import org.springframework.stereotype.Component;

@Component
public class Login {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        System.out.println("pojo username set");
        this.username = name;
    }

 
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("pojo password set");
        this.password = password;
    }
    
}