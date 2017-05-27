package cw06;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        long millisOne = System.currentTimeMillis();
        String s="hello";
        for (int i = 0; i < 10; i++) {
            arrayList.add("Hello");
        }
        long millisTwo = System.currentTimeMillis();
        System.out.println(millisOne-millisTwo);
//        get    ->    start middle end
//        add    ->    start middle end
//        set    ->    start middle end
//        remove ->    start middle end
    }
}
