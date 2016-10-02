package cw10;

import cw10.Dog;

/**
 * Created by evgeniy on 02/10/16.
 */
public class EqualsTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 2);
        Dog dog2 = new Dog("Rex", 2);

        System.out.println(dog1.equals(dog2));
    }
}
