package com.cybertek;

import com.cybertek.config.CybertekAppConfig;
import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext conteiner = new AnnotationConfigApplicationContext(CybertekAppConfig.class);

        Course course = conteiner.getBean("java", Course.class);

        course.getTeachingHours();
    }
}