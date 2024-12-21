package com.java.Switch_Cases;

public class Switch_case_new {
    public static void main(String[] args) {
        String day="thursday";
        String result="";

        result=switch(day)
        {
            case "sunday" -> "8am";
            case "thursday" -> "10am";
            default -> "6am";
        };
        System.out.println(result);
    }
}
