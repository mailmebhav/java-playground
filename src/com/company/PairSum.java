package com.company;

import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2, -3, 3, 3, -2 };
        int s = 5;
//        int[] arr = {2, -6, 2, 5, 2};
//        int s = 4;
//        int[] arr = {1, 2, 3, 4, 5 };
//        int s = 0;

        List<int[]> result = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] + arr[j] == s) {
                    if(arr[i] > arr[j]) {
                        int[] res = {arr[j], arr[i]};
                        result.add(res);
                    } else {
                        int[] res = {arr[i], arr[j]};
                        result.add(res);
                    }
                }
            }
        }
//        Arrays.sort(arr);
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < arr.length; i++) {
//            map.put(arr[i], i);
//        }
//        for(int i = 0; i < arr.length; i++) {
//            int complement = s - arr[i];
//            if(map.containsKey(complement)) {
//                int[] res = {arr[i], complement};
////                map.remove(complement);
////                map.remove(arr[i]);
//                result.add(res);
//            }
//        }
        int[][] results = new int[result.size()][2];
        for(int i = 0; i < result.size(); i++) {
            results[i] = result.get(i);
        }

        for(int i = 0; i < results.length; i++) {
            for(int j = 0; j < results[i].length; j++) {
                System.out.println(results[i][j]);
                System.out.println(" ");
            }
        }
    }
}
