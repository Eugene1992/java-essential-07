package cw05.interface_example;

/**
 * Created by evgeniy on 19/09/16.
 */
public class Cat implements Runnable{
    private int speed; // km/hour

    public Cat(int speed) {
        this.speed = speed;
    }

    @Override
    public int getDistance(int hours) {
        return speed * hours;
    }
}
