package com.company;

import java.util.Arrays;

public class DesignPhoneDirectory {

    public static void main(String[] args) {
        int maxNumber = 3;
        DesignPhoneDirectory phoneDirectory = new DesignPhoneDirectory(3);
        int val = phoneDirectory.get();      // It can return any available phone number. Here we assume it returns 0.
        System.out.println(val);
        val = phoneDirectory.get();      // Assume it returns 1.
        System.out.println(val);
        boolean boolVal = phoneDirectory.check(2);   // The number 2 is available, so return true.
        System.out.println(boolVal);
        val = phoneDirectory.get();      // It returns 2, the only number that is left.
        System.out.println(val);
        boolVal = phoneDirectory.check(2);   // The number 2 is no longer available, so return false.
        System.out.println(boolVal);
        phoneDirectory.release(2); // Release number 2 back to the pool.
        boolVal = phoneDirectory.check(2);   // Number 2 is available again, return true.
        System.out.println(boolVal);
    }
    int[] arr;
    public DesignPhoneDirectory(int maxNumbers) {
        arr = new int[maxNumbers];
        Arrays.fill(arr, 0);
    }

    public int get() {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                arr[i] = 1;
                return i;
            }
        }

        return -1;
    }

    public boolean check(int number) {
        if(arr[number] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void release(int number) {
        arr[number] = 0;
    }
}
