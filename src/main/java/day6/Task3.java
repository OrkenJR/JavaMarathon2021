package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Orken");
        Teacher teacher = new Teacher("Kakashi", "Algebra");
        teacher.evaluate(student);
    }
}
