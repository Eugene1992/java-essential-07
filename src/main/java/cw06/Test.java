package cw06;

import java.util.Arrays;

/**
 * Created by evgeniy on 21/09/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3, -4, 2, -5};
        int[] arr2 = {12, 2, 3, -4, 2, -1};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(arr.equals(arr2));
    }
}
