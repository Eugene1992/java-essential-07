package hw01;

public class Student {
    private String name;
    private boolean isDegre;
    private int age;
    private double mark;
    private static String favouritePlace = "Polyana";

    Student() {
    }

    Student(String name, boolean isDegre, int age, double mark) {
        this.name = name;
        this.isDegre = isDegre;
        this.age = age;
        this.mark = mark;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDegre() {
        return isDegre;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public void setDegre(boolean degre) {
        isDegre = degre;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public static void setFavouritePlace(String favouritePlace) {
        Student.favouritePlace = favouritePlace;
    }

    public static String getFavouritePlace() {
        return favouritePlace;
    }

    public void doSomething() {
        System.out.println(name);
    }

    static void drink(Student student){
        System.out.println(student.name);
    }
}
