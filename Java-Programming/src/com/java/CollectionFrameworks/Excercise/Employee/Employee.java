package com.java.CollectionFrameworks.Excersice.Employee;

import java.util.ArrayList;

public class Employee {
    public static void main(String[] args) {

        ArrayList<Employees> list=new ArrayList<>();

        Employees employee1=new Employees();
        employee1.setId(1);
        employee1.setName("Roopi");
        employee1.setAge(23);
        employee1.setPhNo("94546523145");
        employee1.setEmail("abcd@gmail.com");


        Employees employee2 =new Employees();
        employee2.setId(2);
        employee2.setName("Roopi");
        employee2.setAge(23);
        employee2.setPhNo("94546523145");
        employee2.setEmail("abcd@gmail.com");

        Employees employee3 =new Employees();
        employee3.setId(1);
        employee3.setName("Roopi");
        employee3.setAge(23);
        employee3.setPhNo("94546523145");
        employee3.setEmail("abcd@gmail.com");


        Employees employee4 =new Employees();
        employee4.setId(1);
        employee4.setName("Roopi");
        employee4.setAge(23);
        employee4.setPhNo("94546523145");
        employee4.setEmail("abcd@gmail.com");


        Employees employee5 =new Employees();
        employee5.setId(1);
        employee5.setName("Roopi");
        employee5.setAge(23);
        employee5.setPhNo("94546523145");
        employee5.setEmail("abcd@gmail.com");


        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        list.add(2,employee2);
        list.remove(2);

//        System.out.println(list);
        for(Employees employe :list){
            System.out.println(employe);
        }


    }
}
