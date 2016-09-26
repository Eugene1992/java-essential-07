package cw08;

import cw03.composition.inheritance.WildAnimal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by evgeniy on 26/09/16.
 */
public class Test {
    {
        Dog homeDog = new Dog(){
            @Override
            public void bark() {
                System.out.println("Bark like a home dog...");
            }
        };

        class WildDog {

        }
    }

    public Test() {
        Dog homeDog = new Dog(){
            @Override
            public void bark() {
                System.out.println("Bark like a home dog...");
            }
        };

        class WildDog {

        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog homeDog = new Dog(){
            @Override
            public void bark() {
                System.out.println("Bark like a home dog...");
            }
        };

        dog.bark();
        homeDog.bark();

        Cat cat1 = new Cat("Barsik", 2);
        Cat cat2 = new Cat("Murka", 5);
        Cat cat3 = new Cat("Persik", 1);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat3);
        cats.add(cat2);

        System.out.println(cats);

        CatByAgeComparator comparator1 = new CatByAgeComparator();
        CatByNameComparator comparator2 = new CatByNameComparator();

        Comparator<Cat> comparator3 = new Comparator<Cat>() {
            @Override
            public int compare(Cat cat1, Cat cat2) {
                return cat1.getName().compareTo(cat2.getName());
            }
        };

        Collections.sort(cats, new Comparator<Cat>() {
            @Override
            public int compare(Cat cat1, Cat cat2) {
                return cat1.getName().compareTo(cat2.getName());
            }
        });

        System.out.println(cats);

        class WildDog extends Dog implements Cloneable {
            public String name;

            public WildDog(String name) {
                this.name = name;
            }

            public void f() {

            }

            class A {

            }
        }

        WildDog wildDog1 = new WildDog("Rex");
        WildDog wildDog2 = new WildDog("Tom");

    }

    void g() {
//        WildDog wildDog1 = new WildDog("Rex");
    }
}
