package com.java.CollectionFrameworks.Excersice.Employee;

import java.util.Objects;

public class Employees {

    private int id;
    private String name;
    private int age;
    private String email;
    private String phNo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public Employees() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return id == employees.id && age == employees.age && Objects.equals(name, employees.name) && Objects.equals(email, employees.email) && Objects.equals(phNo, employees.phNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, email, phNo);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phNo='" + phNo + '\'' +
                '}';
    }
}
