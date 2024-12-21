package com.java.datatypes;

public class DataTypes {

    public static void main(String[] args) {
        System.out.println("Hello World......!");
        /*
        Working with premitives
         */
        byte age;
        age = 21;
        System.out.println("I am " + age+" years old");

        short myMoney;
        myMoney = 100;
        System.out.println("My pocket money is " + myMoney);

        int mySalary;
        mySalary = 100000;
        System.out.println("My salary per month " + mySalary);

        long totalsavings;
        totalsavings=10000000;
        System.out.println("My annual savings are " + myMoney);
        System.out.println(totalsavings);

        float avgSalary;
        avgSalary=6541.12f;
        System.out.println("AvgSalary : " + avgSalary);

        double avgAnnualIncome;
        avgAnnualIncome = 5423154.12354;
        System.out.println("Avg AnnualIncome : " + avgAnnualIncome);

        String name;
        name="Rupee";
        System.out.println("Name : " + name);

        char gender;
        gender = 'M';
        System.out.println("Gender : " + gender);

        boolean isEligible;
        isEligible = true;
        System.out.println("Eligibility : " + isEligible);
    }
}
