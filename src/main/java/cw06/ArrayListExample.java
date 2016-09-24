package cw06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> arr = new LinkedList<>();
        arr.add("Hello");
        arr.add("Hello");
        arr.add("Hello");
        arr.add("Hello");
        arr.add("Hello");
        System.out.println(arr.get(0));
        arr.set(0, "Hello world");
        System.out.println(arr.get(0));
//        arr.remove(0);
//        System.out.println(arr.get(0));
        System.out.println(arr.size());
        System.out.println(arr.contains("Hello"));
        System.out.println(arr.contains("Hello world"));
        System.out.println(arr.indexOf("Hello world"));

//        arr.clear();

        List<String> sub = arr.subList(0, 2);

        System.out.println(arr);
        System.out.println(sub);
    }
}
