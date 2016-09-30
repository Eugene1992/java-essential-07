package cw04;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik");
        Animal dog = new Dog("Rex");
        Animal duck = new Duck("Ducky");
        Animal animal = new Animal("Dog");

        speakAll(new Animal[]{cat, dog, duck, animal});
    }

    static void speakAll(Animal[] animals) {
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}

