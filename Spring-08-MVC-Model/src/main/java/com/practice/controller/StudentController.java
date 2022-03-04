package com.practice.controller;

import com.practice.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

@RequestMapping("/welcome")
public String homepage(Model model){

    model.addAttribute("name","Cydeo");//these variable are local to this method only
    model.addAttribute("course","MVC");

    String subject = "Collections";
    model.addAttribute("subject",subject);

    int studentId = new Random().nextInt();
    model.addAttribute("studentId",studentId);

    List<Integer> numbers = new ArrayList<>();
    numbers.add(4);
    numbers.add(5);
    numbers.add(7);
    numbers.add(10);
    model.addAttribute("numbers",numbers);

    Student student = new Student(1,"Mike","Smith");
    model.addAttribute("student",student);


    return "student/welcome";
}

    @RequestMapping("/suya")
    public String homepage2(Model model){

        return "student/welcome"; // empty page, above variables are not available
    }

}
