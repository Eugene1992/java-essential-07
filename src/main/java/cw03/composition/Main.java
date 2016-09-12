package cw03.composition;

/**
 * Created by evgeniy on 12/09/16.
 */
public class Main {
    public static void main(String[] args) {
        Freshener freshener = new Freshener();
        Car car = new Car(freshener);
        car.run();
        car = null;
    }
}
