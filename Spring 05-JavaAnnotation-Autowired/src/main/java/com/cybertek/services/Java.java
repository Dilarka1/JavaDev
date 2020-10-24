package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Autowired
    private ExtraSession extraSession;
/*
    //Constructor Injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
 */

    public ExtraSession getExtraSession() {
        return extraSession;
    }
/*
    //Setter Injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
 */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours :" + (30 + extraSession.getHours()));
    }
}