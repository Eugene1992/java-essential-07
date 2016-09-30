package cw09;

public class Test2 {
    int a = 10;
    static int b = 10;

    static class Nested {
        void f(Test2 test2) {
            System.out.println(test2.a);
            System.out.println(b);
        }
    }

    static void s(Test2 test2){
        System.out.println(test2.a);
        System.out.println(b);
    }
}
