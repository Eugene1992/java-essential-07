package cw05.interface_example;

/**
 * Created by evgeniy on 19/09/16.
 */
public interface Runnable extends A {

    int getDistance(int hours);

    default void move() {

    }

    default void d() {
        System.out.println("Hello from default method in interface!");
    }

    static void s() {
        System.out.println("Hello from static method in interface!!");
    }
}
