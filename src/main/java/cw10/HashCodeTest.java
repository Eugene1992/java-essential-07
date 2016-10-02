package cw10;

/**
 * Created by evgeniy on 02/10/16.
 */
public class HashCodeTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 2);
        Dog dog2 = new Dog("Rex", 2);

        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
    }
}
