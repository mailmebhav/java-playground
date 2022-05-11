package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class OddEvenJump {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,4,4,5};
        Queue<Integer> q = new LinkedList<>();

        int jumps = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            int k = i;
            for(int j = i + 1; j < arr.length; j++) {
                System.out.println("j " + j);
                System.out.println("k " + k);
                System.out.println("count " + count);
                if(count % 2 != 0) {
                    if(arr[k] <= arr[j]) {
                        k = j;
                        count++;
                        System.out.println("odd");
                    }
                } else {
                    if(arr[k] >= arr[j]) {
                        k = j;
                        count++;
                        System.out.println("even");
                    }
                }
            }
            if(k == arr.length - 1) {
                System.out.println("valid index " + i);
                jumps++;
                System.out.println(jumps);
            }
        }

        System.out.println(jumps+ 1);

    }
}
