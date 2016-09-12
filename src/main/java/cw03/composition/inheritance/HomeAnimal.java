package cw03.composition.inheritance;

public class HomeAnimal extends Animal {
    private String home;

    public HomeAnimal(int height, int weight, String home) {
        super(height, weight);
        this.home = home;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void findHome() {

    }
}
