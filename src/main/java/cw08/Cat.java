package cw08;

/**
 * Created by evgeniy on 26/09/16.
 */
public class Cat implements Comparable<Cat>{

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat anotherCat) {
        if (anotherCat.age > this.age) {
            return 1;
        }
        if (anotherCat.age < this.age) {
            return -1;
        }
        return 0;
    }
}
