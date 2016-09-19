package HwTwoOOPSquare;

/**
 * Created by Roma on 19.09.2016.
 */
public class Parallelogram extends Trapeze{
    private int ha;
    public Parallelogram(int a, int b, int h, int ha){
        super(a,b,h);
        this.ha=ha;
    }
    @Override
    public void figue(){
      int S;
        S=a*ha;
        System.out.println(S);
    }
}
