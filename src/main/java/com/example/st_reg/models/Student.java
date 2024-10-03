package com.example.st_reg.models;

public class Student {
    private String name;
    private String department;
    private String gender;

    public Student(){

    }
    public Student(String name, String department, String gender) {
        this.name = name;
        this.department = department;
        this.gender = gender;
    }
    //public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getDepartment() {return department;}
    public void setDepartment(String department) {this.department = department;}
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}