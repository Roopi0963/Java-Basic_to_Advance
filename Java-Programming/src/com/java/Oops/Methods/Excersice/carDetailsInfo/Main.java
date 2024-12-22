package Day6.carDetailsInfo;

public class Main {
    public static void main(String[] args) {
        Car car1 =new Car();
        car1.name="Shift Desire";
        car1.brand="Maruthi Suzuki";
        car1.price=850000;
        car1.year=2018;
        car1.displayInfo();

        Car car5 =new Car();
        car5.name="Shift";
        car5.brand="Maruthi Suzuki";
        car5.price=8750000;
        car5.year=2019;
        car5.displayInfo();

        Car car2 =new Car();
        car2.name="BMW x series 1";
        car2.brand="BMW";
        car2.price=10000000;
        car2.year=2013;
        car2.displayInfo();

        Car car3 =new Car();
        car3.name="Rolce Royals ";
        car3.brand="Maruthi Suzuki";
        car3.price=12350000;
        car3.year=2010;
        car3.displayInfo();

        Car car4 =new Car();
        car4.name="MI Z series 3";
        car4.brand="MI";
        car4.price=1020000;
        car4.year=2018;
        car4.displayInfo();

    }
}
