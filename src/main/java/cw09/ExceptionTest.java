package cw09;

/**
 * Created by evgeniy on 30/09/16.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int key = -10;
        String s = null;
        int k = 0;
        try {
            k = 10;
            s.toLowerCase();
            int[] arr = new int[2];
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // multi catch
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finish");
        }

        System.out.println("After try...catch");
        System.out.println(k);
    }
}
