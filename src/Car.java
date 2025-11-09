
//class is created
public class Car {
    String color;
    String model;
    int year;

    void drive() {
        System.out.println("My car is "+ model +" manufatured in the year "+year+" and its color is "+color);
    }


    public static void main(String[] args) {
        //obejct is created
        Car myCar = new Car();
        myCar.color = "yellow";
        myCar.year = 2025;
        myCar.model = "toyota";
        myCar.drive();
    }
}