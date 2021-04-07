package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2015);
        car.setColor("Black");
        car.setModel("BMW");
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
        System.out.println("Model: " + car.getModel());
    }
}

