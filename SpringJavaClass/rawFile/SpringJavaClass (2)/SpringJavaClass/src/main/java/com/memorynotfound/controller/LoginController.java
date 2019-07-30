package com.memorynotfound.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.memorynotfound.model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * HomeController
 */

 
 

@Controller
@RequestMapping("/logincontroller")

public class LoginController {

// @Autowired
// Login log;
   
    @RequestMapping(value = "/login", method = RequestMethod.GET)
     public String login()
    {
        System.out.println("third");
       return "login";
    }

    @RequestMapping(value="/loginprocess")
    public ModelAndView loginprocess(HttpServletRequest request,HttpServletResponse response,@ModelAttribute("loginobj") Login login1)
    {
        ModelAndView mav=new ModelAndView("Welcome");
        mav.addObject("username", login1.getUsername());
        System.out.println(login1.getUsername());
        mav.addObject("password", login1.getPassword());
        System.out.println(login1.getPassword());
        return mav;
    }
}