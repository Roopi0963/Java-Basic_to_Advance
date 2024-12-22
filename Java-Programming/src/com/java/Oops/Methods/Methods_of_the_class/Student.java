package com.java.training.oops.methods;

public class Student {
    int id;
    String name;
    int regNo;
    char sec;
    String dept;
    short mark;


    /*
      Methods are four types :->
        1.No return type No parameters
        2.NO return type with parameters
        3.With return type no parameters
        4.with return type With parameters
     */

    /*
        1.No return type No parameters {Void will contain no return type}
     */

    void displayStudentDetails(){
        System.out.println("Student id no : "+id);
        System.out.println("Name of the Student : " + name);
        System.out.println("Register number : "+regNo);
        System.out.println("Section : " + sec);
        System.out.println("Department : " + dept);
    }
    
    
    /*
        2.No return type With parameters
     */
    void displayStudentMarks(int marks) {
        System.out.println(name + " Marks is : " + marks);
    }


        /*
            3.With return type without parameters
         */
    char displayStudentGrades(){
        char grade;
        if(mark >= 90){
            grade='S';
        }
        else if(mark >= 80 && mark <90){
            grade='A';

        } else if (mark >=50 && mark <80) {
            grade='B';
        }
        else{
            grade='c';
        }
    return grade;
    }


}

