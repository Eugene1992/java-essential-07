package HomeWorkShape;

/**
 * Created by Roma on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Shape cicrcle = new Circle(3.0);
        Shape diamond = new Diamond(2,5);
        Shape rectengle = new Rectangle(4,1);
        Shape square = new Square(5);
        Shape triangle = new Triangle(3,7);
        SquareAll(new Shape[]{cicrcle,diamond, rectengle, square, triangle});
    }
    static void SquareAll(Shape []AllSquare){
        for(Shape shape : AllSquare){
            System.out.println(shape.square());
        }
    }
}
