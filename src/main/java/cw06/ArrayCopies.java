package cw06;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by evgeniy on 21/09/16.
 */
public class ArrayCopies {
    public static void main(String[] args) {
        int[] arr =  {11, 2, 3};

        int[] copyOne = Arrays.copyOf(arr, 10);

        int[] buf = new int[3];

        System.arraycopy(arr, 0, buf, 0, 3);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyOne));
        System.out.println(Arrays.toString(buf));

    }
}
