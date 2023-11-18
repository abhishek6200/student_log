package com.firstProject.Student.Api.service;

import com.firstProject.Student.Api.model.studentModel;

import com.firstProject.Student.Api.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class studentService {
    @Autowired
    studentRepository db;
    public int bmi(int studentId){
      studentModel ele = db.getStudentDetailsbyId(studentId);
      int ht = ele.getHeight();
      int wt = ele.getWeight();
       int Bmi = wt/(ht*ht);
       return Bmi;
    }
    public studentModel maxAptitude(){
      int max = Integer.MIN_VALUE;
      studentModel ans = null;
      List<studentModel> ele = db.getAllStudents();
      for(studentModel student : ele){
          if(student.getAptitude() > max){
              max = student.getAptitude();
              ans = student;
          }
      }
      return ans;
    }
   public String addStudent(studentModel obj){
        int id = obj.getStudentId();
        db.addStudent(obj);
        return "student added succesfully";
   }
    public List<studentModel> getAllStudent(){
        List<studentModel> res =db.getAllStudents();

        return res;
    }
}
