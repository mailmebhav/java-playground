package main.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello, World!");
//        int n = 10;
        int nums[] = new int[1];
        nums[0] = 0;
        int max = nums[0];
        int xor = nums[0];
        for(int i = 1; i < nums.length; i++) {
            System.out.println("xor " + xor);
            if(nums[i] > max) {
                max = nums[i];
            }
            xor = xor ^ nums[i];
        }
        int maxXor = 0;
        for(int i = 1; i <= max; i++) {
            System.out.println("maxXor " + maxXor);
            maxXor = maxXor ^ i;
        }
        System.out.println(maxXor);
        System.out.println(xor);
        System.out.println(maxXor ^ xor);
    }
}
