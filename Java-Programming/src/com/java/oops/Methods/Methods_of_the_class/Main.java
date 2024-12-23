package com.java.training.oops.methods;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.id=1001;
        student1.name="Rupee";
        student1.regNo=992200001;
        student1.sec='A';
        student1.dept="CSE";
        student1.displayStudentDetails();

        Student student2 = new Student();

        student2.id=1002;
        student2.name="Raavan";
        student2.regNo=992200002;
        student2.sec='B';
        student2.dept="CSE";
        student2.displayStudentDetails();

        Student student3 = new Student();

        student3.id=1003;
        student3.name="Krish";
        student3.regNo=992200003;
        student3.sec='C';
        student3.dept="ECE";
        student3.displayStudentDetails();



        Student student = new Student();

        student.id=1003;
        student.name="Krish";
        student.regNo=992200003;
        student.sec='C';
        student.dept="ECE";
        student.mark=90;
        student.displayStudentDetails();
        student.displayStudentMarks(92);
        System.out.println("Student Grade is : "+student.displayStudentGrades());


    }
}
