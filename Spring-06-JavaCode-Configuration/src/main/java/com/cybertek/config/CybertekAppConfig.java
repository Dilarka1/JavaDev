package com.cybertek.config;

import com.cybertek.interfaces.ExtraSessions;
import com.cybertek.services.Java;
import com.cybertek.services.OfficeHours;
import com.cybertek.services.Selenium;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@Configuration
@ComponentScan("com.cybertek")
@PropertySource("classpath:application.properties")
public class CybertekAppConfig {

    @Bean
    public Java java(){
        return new Java(extraSessions());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }
  /*
    @Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }
   */

    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }

    @Value("JD1")
    private String batch;
    @Value("${days}")
    private String []days;
    @Value("${instructor}")
    private String instructor;


    @Override
    public String toString() {
        return "CybertekAppConfig{" +
                "batch='" + batch + '\'' +
                ", days=" + Arrays.toString(days) +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}