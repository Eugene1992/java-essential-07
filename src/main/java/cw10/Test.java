package cw10;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 2, new ChildCat("Baby"));
        Cat cat2 = new Cat("Barsik", 2, new ChildCat("Baby"));
        Cat cloneCat = null;
        try {
            cloneCat = (Cat) cat2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(cat2);
        System.out.println(cloneCat);

        cloneCat.getChildCat().setName("Baby2");
        System.out.println(cat2);
        System.out.println(cloneCat);

        System.out.println();
    }
}
