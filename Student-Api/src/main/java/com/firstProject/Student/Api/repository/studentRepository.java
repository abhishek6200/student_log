package com.firstProject.Student.Api.repository;

import com.firstProject.Student.Api.model.studentModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository

public  class studentRepository {
    HashMap<Integer, studentModel> stuDb;

    public studentRepository(){
        this.stuDb = new HashMap<>();
    }
 public studentModel getStudentDetailsbyId(int studentId){
        return stuDb.get(studentId);
 }
 public List<studentModel> getAllStudents(){

        List<studentModel> ans = new ArrayList<>();
        for(int id : stuDb.keySet()){
            ans.add(stuDb.get(id));
        }
        return ans;
 }
 public void addStudent(studentModel obj){
        int stuId = obj.getStudentId();
        stuDb.put(stuId, obj);
 }
}
