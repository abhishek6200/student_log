package com.firstProject.Student.Api.controller;

import com.firstProject.Student.Api.model.studentModel;
import com.firstProject.Student.Api.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {
    @Autowired
    studentService stuService;
    @RequestMapping("/api/getStudents")
    @GetMapping
    public List<studentModel> getStudents(){
        return stuService.getAllStudent();
    }
    @RequestMapping("/api/bmi")
    @GetMapping
    public int bmi(@RequestParam int studentId){
        return stuService.bmi(studentId);
    }
    @RequestMapping("/api/addStudents")
    @PostMapping
    public String addStudent(@RequestBody studentModel obj){
        return stuService.addStudent(obj);
    }
}
