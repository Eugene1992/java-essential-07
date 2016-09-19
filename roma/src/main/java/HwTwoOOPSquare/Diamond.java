package HwTwoOOPSquare;

/**
 * Created by Roma on 19.09.2016.
 */
public class Diamond extends Rectangle {
    private int h;

    public Diamond(int a, int b, int h) {
        super(a,b);
        this.h = h;
    }

    @Override
    public void figue() {
        int S;
        S = a * h;
        System.out.println(S);
    }
}
