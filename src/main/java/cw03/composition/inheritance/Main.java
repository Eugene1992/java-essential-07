package cw03.composition.inheritance;

public class Main {
    public static void main(String[] args) {
        HomeAnimal homeAnimal = new HomeAnimal(50, 20, "Savana");
        WildAnimal wildAnimal = new WildAnimal(30, 10, "Tropic");

        Animal someAnimal = new WildAnimal(30, 10, "Tropic");

        if (someAnimal instanceof WildAnimal) {
            WildAnimal casted = (WildAnimal) someAnimal;
            System.out.println(casted.getHabitat());
        }


        /*Animal[] animals = {homeAnimal, wildAnimal};
        getMaxWeight(animals);*/

    }

    public static Animal getMaxWeight(Animal[] animals) {
        Animal maxWightAnimal = animals[0];
        for (Animal animal : animals) {
            if (animal.getWeight() > maxWightAnimal.getWeight()) {
                maxWightAnimal = animal;
            }
        }
        return maxWightAnimal;
    }
}
