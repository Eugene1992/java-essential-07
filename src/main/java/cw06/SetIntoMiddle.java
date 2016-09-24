package cw06;

import java.util.ArrayList;

/**
 * Created by evgeniy on 21/09/16.
 */
public class SetIntoMiddle {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("0");
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.add("5");
        arr.add("7");
        arr.add("8");
        arr.add("9");
        System.out.println(arr);
        arr.add(3, "100");
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
    }
}
