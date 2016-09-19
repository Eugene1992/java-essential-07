package cw05.interface_example;

/**
 * Created by evgeniy on 19/09/16.
 */
public class Human implements Runnable {
    private int speed; // km/hour

    public Human(int speed) {
        this.speed = speed;
    }

    @Override
    public int getDistance(int hours) {
        return speed * hours;
    }
}
