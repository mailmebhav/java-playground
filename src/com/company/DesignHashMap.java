package com.company;

import java.util.Arrays;

public class DesignHashMap {
    int[] arr;

    public DesignHashMap() {
        arr = new int[100000000];
        Arrays.fill(arr, -1);
    }

    public static void main(String[] args) {
        DesignHashMap d = new DesignHashMap();
        d.put(1, 1);
        d.put(2, 2);
        System.out.println(d.get(1));
        System.out.println(d.get(3));
        d.put(2, 1);
        System.out.println(d.get(2));
        d.remove(2);
        System.out.println(d.get(2));
    }


    public void put(int key, int value) {
        arr[key] = value;
        System.out.println(Integer.hashCode(key));
    }

    public int get(int key) {
        return arr[key];
    }

    public void remove(int key) {
        arr[key] = -1;
    }
}

