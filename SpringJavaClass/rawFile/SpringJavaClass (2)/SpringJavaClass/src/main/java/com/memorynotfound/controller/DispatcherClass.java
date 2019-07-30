package com.memorynotfound.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * DispatcherClass
 */
public class DispatcherClass implements WebApplicationInitializer {

    

    public void onStartup(ServletContext servletContext) throws ServletException {
       

        AnnotationConfigWebApplicationContext anno = new AnnotationConfigWebApplicationContext();
      
        anno.setConfigLocation("com.memorynotfound.controller");
        anno.register(SpringConfig.class);
        anno.setServletContext(servletContext);
        System.out.println("first works");
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcherclass",
        new DispatcherServlet(anno));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }

}