package com.company;

import java.util.ArrayList;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        int A = 3;
        int T = 0;
        int B = A;
        int L = 0;
        int R = A;
        int count = 1;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        int[][] array = new int[A][A];
        while (T < B && L < R) {
            for (int i = L; i < R; i++) {
                array[T][i] = count;
                count++;
            }
            T++;
            for (int i = T; i < B; i++) {
                array[i][R - 1] = count;
                count++;
            }
            R--;
            if(T< B){
                for(int i= R-1; i >=L ; i--) {
                    array[B-1][i] = count;
                    count++;
                }
                B--;
            }
            if(L<R){
                for(int i = B-1; i >= T;i--){
                    array[i][L] = count;
                    count++;
                }
                L++;
            }
        }

        for (int i = 0; i < A; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < A; j++) {
                arrayList.add(array[i][j]);
            }
            arr.add(arrayList);
        }
        System.out.println(arr);
    }
}
