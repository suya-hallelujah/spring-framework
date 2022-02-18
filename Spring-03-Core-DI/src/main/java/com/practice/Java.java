package com.practice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor

public class Java {

    /*
    Field Injection (it's going to be deprecated at some point in the future)
    @Autowired
    OfficeHours officeHours;

     */


    OfficeHours officeHours;
    /*
    @Autowired (if you only have 1 constructor, Spring is automatically going to use @Autowired)
    public Java (OfficeHours officeHours){
        this.officeHours = officeHours;
    }
     */

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
