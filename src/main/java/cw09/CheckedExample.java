package cw09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            m();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    static void f() {
        try {
            InputStream is = new FileInputStream("C:/data.txt"); // checked
        } catch (FileNotFoundException e) {

        }
    }

    static void m() throws FileNotFoundException {
        InputStream is = new FileInputStream("C:/data.txt"); // checked
    }

    static void d() throws NegativeAgeException {
        throw new NegativeAgeException("Negative value of age");
    }
}
