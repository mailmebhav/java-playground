package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.String.valueOf;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(30);
        arr.add(34);
        arr.add(5);
        arr.add(9);
        LargestNumber l = new LargestNumber();
        String s = l.largestNumber(arr);
        System.out.println(s);
    }

    public String largestNumber(ArrayList<Integer> A) {
        String s = "";
        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        int maxIndex = 0;
        for (int i = 0; i < A.size(); i++) {
            int max = 0;
            int maxVal = 0;
            for (int j = 0; j < A.size(); j++) {
                int val = A.get(j);
                int valMod = val % 10;
                if (val != -1) {
                    if (valMod > max) {
                        max = valMod;
                        maxVal = val;
                        maxIndex = j;
                    }
                }
            }
            s = s + maxVal;
            A.set(maxIndex, -1);
        }
        return s;
    }


}
