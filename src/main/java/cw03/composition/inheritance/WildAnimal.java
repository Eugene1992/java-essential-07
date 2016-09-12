package cw03.composition.inheritance;

/**
 * Created by evgeniy on 12/09/16.
 */
public class WildAnimal extends Animal {

    private String habitat;

    public WildAnimal(int height, int weight, String habitat) {
        super(height, weight);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
