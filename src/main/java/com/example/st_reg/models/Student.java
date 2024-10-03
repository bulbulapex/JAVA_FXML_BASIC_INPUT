package com.example.st_reg.models;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

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
        return  "Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getDetails() {
        String filePath = "Write.txt";
        String fullText = "";
        try {
            FileReader rd = new FileReader(filePath);
            BufferedReader br = new BufferedReader(rd);

            String line = null;
            while((line = br.readLine()) != null) {
                fullText += line;
                fullText += "\n";
            }

        } catch(Exception ex) {
            System.out.println("File Not Found");
        }
        return fullText;
    }

    public void fWriteFile(){
        String filePath = "Write.txt";
        String fullText = getDetails();
        String newText = toString();
        try{
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            //bw.write(fullText); //I use append true in FileWriter
            bw.write(newText);
            bw.newLine();
            bw.close();
        }catch (IOException e){
            throw new RuntimeException();
        }
    }

}