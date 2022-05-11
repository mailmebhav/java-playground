package com.company;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        int[] A = {-4,-1,0,3,10};
        int[] res = squaresOfSortedArray.sortedSquares(A);
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public int[] sortedSquares(int[] A) {
        int l = 0;
        int r = A.length - 1;
        int[] res = new int[A.length];
        int k = r;
        while(l <= r) {
            if(Math.abs(A[l]) > A[r]) {
                res[k--] = A[l] * A[l];
                l++;
            } else {
                res[k--] = A[r] * A[r];
                r--;
            }
        }

        return res;
    }
}
