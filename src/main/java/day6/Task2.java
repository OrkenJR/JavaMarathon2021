package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("BOEING", 2007, 76.25, 27000 );
        airplane.info();
        airplane.fillUp(1900);
        airplane.info();
    }
}
