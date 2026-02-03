package com.hsbc.controller;

import com.hsbc.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sayHelloGet(){
        return "Hello";
    }
    @PostMapping("/")
    public String sayHelloPost(){
        return "Hello by Post";
    }
    @GetMapping("/{x}/{y}")
    public String sayHelloName(@PathVariable("x") String name, @PathVariable("y") String technology){
        return "Hello " + name + ", Working in " + technology;
     }
     @PostMapping("/student")
     public String saveStudent(@RequestBody Student student){
         System.out.println(student);
         return "Saved Successfully";
     }
     @GetMapping("/student")
     public Student getStudent(){
        Student student = new Student(101, "Sagar", "sagar@gmail.com");
        return student;
     }
}
