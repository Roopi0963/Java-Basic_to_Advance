package Day5;


import java.lang.String;

public class StudentMain {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();

        student1.name="Rupee";
        student1.age=21;
        student1.regNo=99220011;
        student1.dept="CSE";
        student1.sec="A";

        System.out.println("Name of the student : "+ student1.name);
        System.out.println("Age of the student is : " + student1.age);
        System.out.println("Student register number : "+student1.regNo);
        System.out.println("Department : " + student1.dept);
        System.out.println("Section : " + student1.sec);


        Student student2;
        student2 = new Student();

        student2.name="Krish";
        student2.age=20;
        student2.regNo=99220012;
        student2.dept="ECE";
        student2.sec="B";

        System.out.println("Name of the student : "+ student2.name);
        System.out.println("Age of the student is : " + student2.age);
        System.out.println("Student register number : "+ student2.regNo);
        System.out.println("Department : " + student2.dept);
        System.out.println("Section : " + student2.sec);

        Student student3;
        student3 = new Student();

        student3.name="Raavan";
        student3.age=18;
        student3.regNo=99220013;
        student3.dept="EEE";
        student3.sec="C";

        System.out.println("Name of the student : "+ student3.name);
        System.out.println("Age of the student is : " + student3.age);
        System.out.println("Student register number : "+ student3.regNo);
        System.out.println("Department : " + student3.dept);
        System.out.println("Section : " + student3.sec);


//        Student student4;
//        student4 = new Student();
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter student details :-> ");
//        System.out.print("Name of the student : "+ student4.name);
////        sc.nextLine(student4.name);
//        System.out.print("Age of the student is : " + student4.age);
//        sc.nextInt(student4.age);
//        System.out.println("Student register number : "+ student4.regNo);
//        sc.nextInt(student4.regNo);
//        System.out.println("Department : " + student4.dept);
////        sc.nextLine(student4.dept);
////        System.out.println("Section : " + student4.sec);
////        sc.nextLine(student4.sec);
    }
}
