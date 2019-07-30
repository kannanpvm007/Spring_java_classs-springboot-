package com.memorynotfound.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

// import javax.servlet.ServletContext;
// import javax.servlet.ServletException;
// import javax.servlet.ServletRegistration;

// import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.web.WebApplicationInitializer;
// import org.springframework.web.context.WebApplicationContext;
// import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
// import org.springframework.web.context.support.XmlWebApplicationContext;
// import org.springframework.web.servlet.DispatcherServlet;

/**
 * DispatcherClass
//  */
// public class DispatcherClass1 implements WebApplicationInitializer {

//     public void onStartup(ServletContext servletContext) throws ServletException {

//         AnnotationConfigWebApplicationContext anno = new AnnotationConfigWebApplicationContext();

//         anno.setConfigLocation("com.memorynotfound.controller");
//         anno.register(SpringConfig.class);
//         anno.setServletContext(servletContext);
//         System.out.println("first works");
//         ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcherclass",
//         new DispatcherServlet(anno));
//         servlet.setLoadOnStartup(1);
//         servlet.addMapping("/");
//     }

// }

/**
 * DispatcherClass1
 */
public class DispatcherClass1 implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ano= new AnnotationConfigWebApplicationContext();
                                          // System.out.println("1st run");
        ano.setConfigLocation("com.memorynotfound.controller");
                                        // System.out.println("setConfigLocation run");
        ano.register(SpringConfig1.class);
                                      // System.out.println("register run");
        ano.setServletContext(servletContext);
                                   // System.out.println("setServletContext run");
        ServletRegistration.Dynamic servlet=servletContext.addServlet("dispatcherclass1", 
        new DispatcherServlet(ano));
                               //System.out.println("ServletRegistration run");
        servlet.setLoadOnStartup(1);
                             //  System.out.println("setLoadOnStartup run");
        servlet.addMapping("/");

    }

    
}