package com.java.Arrays.Exercise.FacultyManagement;

public class Faculty {
    public String name;
    public String phNo;
    public byte age;
    public String email;
    public byte experience;
    public int salary;

    public  static String CollegeName="CollegeName";

    public Faculty(String name, String phNo, byte age, String email, byte experience) {
        this.name = name;
        this.phNo = phNo;
        this.age = age;
        this.email = email;
        this.experience = experience;
//        this.salary = salary;
    }

    public int getSalary(){
        if(experience>=15){
            salary=100000;
        }
        else if(experience>=10 && experience<15){
            salary=70000;
        } else if (experience>=5 && experience<10) {
            salary=50000;
        } else if (experience>=3 && experience<5) {
            salary=40000;
        } else if (experience>=1 && experience<3) {
            salary=30000;
        }
        else {
            salary=15000;
        }
        return salary;
    }
    public static void getCollegeName(){
        System.out.println("College name is : "+CollegeName);
    }

    void displayDetails(){
        System.out.println("Name of the faculty : "+name);
        System.out.println("PhoneNo  : "+phNo);
        System.out.println("Age : "+age);
        System.out.println("Email : "+email);
        System.out.println("Experience : "+experience);
        System.out.println("Salary : "+getSalary());
        getCollegeName();
    }
}
