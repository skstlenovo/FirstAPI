package com.example.Student_Management_System;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {

    HashMap<Integer,Student> hashMap=new HashMap<>();// to store data( in place of DB)

    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student student){
        int key=student.getRollNo();
        hashMap.put(key,student);
    }
    @GetMapping("/getStudentInfo")
    public Student getStudent(@RequestParam int rollNo)
    {
        Student student= hashMap.get(rollNo);
        return student;
    }

}
