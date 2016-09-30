package cw09;

/**
 * Created by evgeniy on 30/09/16.
 */
public class ErrorExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[Integer.MAX_VALUE];
        } catch (Error e) {
            System.out.println("Error...");
        }
    }
}
