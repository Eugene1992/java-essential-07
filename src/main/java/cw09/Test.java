package cw09;

import java.io.Serializable;

public class Test {
    int key = 10;

    static {
//        Local local = new Local();
    }

    Test() {
//        Local local = new Local();
    }

    public static void main(String[] args) {
//        Local local = new Local();
    }

    protected void f() {
        final int val1 = 10; //  final
        int val2 = 10; // effectively final

        class Local extends Test implements Cloneable, Serializable {
            public int k;

            public Local(int k) {
                this.k = k;
            }

            public void h() {
                System.out.println(key);
                System.out.println(val1);
                System.out.println(val2);
            }
        }

        Local local = new Local(1);
    }
}
