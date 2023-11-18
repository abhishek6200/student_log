package com.firstProject.Student.Api.model;

public class studentModel {
    int studentId;
    private int height;
    private int weight;
    private int aptitude;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public studentModel(int studentId, int height, int weight, int aptitude) {
        this.studentId = studentId;
        this.height = height;
        this.weight = weight;
        this.aptitude = aptitude;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAptitude() {
        return aptitude;
    }

    public void setAptitude(int aptitude) {
        this.aptitude = aptitude;
    }
}
