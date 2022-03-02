package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

@RequestMapping("/welcome")
public String homepage(Model model){

    model.addAttribute("name","Cydeo");//these variable are local to this method only
    model.addAttribute("course","MVC");



    return "student/welcome";
}

    @RequestMapping("/suya")
    public String homepage2(Model model){

        return "student/welcome"; // empty page, above variables are not available
    }

}
