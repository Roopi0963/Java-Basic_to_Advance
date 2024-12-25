package com.java.Arrays.Exercise.FacultyManagement;

public class Main {
    public static void main(String[] args) {

        Faculty[] faculties={
                new Faculty("Krish","65132",(byte) 41,"adf@gmail.com",(byte)12),
                new Faculty("Krish","65132",(byte) 41,"adf@gmail.com",(byte)12)
        };

        for(Faculty faculty : faculties){
            faculty.displayDetails();
        }


    }
}
