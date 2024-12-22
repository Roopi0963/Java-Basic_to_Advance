package Day6.carDetailsInfo;

public class Car {
    String name;
    String brand;
    int year;
    double price;

    void displayInfo(){
        System.out.println("Name of the car : "+name);
        System.out.println("Brand : "+brand);
        System.out.println("Model of the year : "+year);
        System.out.println("Price of the car : "+price);
    }
}
