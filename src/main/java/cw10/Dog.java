package cw10;

/**
 * Created by evgeniy on 02/10/16.
 */
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (this.age != dog.age) return false;
//        value null
//        null  value
//        value value
//        null  null
        if (name != null) {
            return name.equals(dog.name);
        } else {
            return dog.name == null;
        }
    }

    @Override
    public int hashCode() {
        int result;

        if (name != null){
            result = name.hashCode();
        } else {
            result = 0;
        }

        result = 31 * result + age;

        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
