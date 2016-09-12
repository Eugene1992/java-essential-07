package cw03.composition;

public class Car {
    private String model;
    private String color;
    private Engine engine = new Engine(); // composition
    private Freshener freshener;          // aggregation

    public Car(Freshener freshener) {
        this.freshener = freshener;
    }

    public void run() {
        freshener.makeSmell();
        engine.on();
    }
}
