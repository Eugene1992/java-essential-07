package cw03.composition.inheritance;

public class Animal {
    protected int height;
    protected int weight;

    public Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println("Run...");
    }
}
