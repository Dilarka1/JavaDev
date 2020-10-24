package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext conteiner = new AnnotationConfigApplicationContext(com.cybertek.config.CybertekAppConfig.class);

        Course course = conteiner.getBean("java", Course.class);


        System.out.println(course.toString());

        course.getTeachingHours();

    }
}