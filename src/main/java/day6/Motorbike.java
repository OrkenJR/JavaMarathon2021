package day6;

public class Motorbike extends Car {
    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    @Override
    public void info() {
        System.out.println("It is a motorcycle");
    }
}