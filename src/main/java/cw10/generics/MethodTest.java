package cw10.generics;

import cw04.Cat;

/**
 * Created by evgeniy on 02/10/16.
 */
public class MethodTest {
    public static void main(String[] args) {
        print(10, new Object());
        print(10, new Cat("Barsik"));
    }

    static <E> void print(int count, E e) {
        for (int i = 0; i < count; i++) {
            System.out.println(e);
        }
    }
}
