package cw05.interface_example;

/**
 * Created by evgeniy on 19/09/16.
 */
public class Test {
    public static void main(String[] args) {
        Runnable cat = new Cat(40);
        Runnable human = new Human(36);
        Runnable car = new Car(300);
        Runnable tornado = new Tornado(70);
        tornado.d();
        Runnable.s();

        Runnable[] runnables = {cat, human, car, tornado};
        printDistances(runnables, 2);
    }

    static void printDistances(Runnable[] runnables, int hours) {
        for (Runnable runnable : runnables) {
            System.out.println(runnable.getDistance(hours));
        }
    }
}
