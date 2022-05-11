package com.company;

public class ReshapeMatrix {

    public static void main(String[] args) {
        int[][] mat = {{1,2}, {3,4}};
        int r = 1, c = 4;

        ReshapeMatrix reshapeMatrix = new ReshapeMatrix();
        int[][] res = reshapeMatrix.matrixReshape(mat, r, c);

        for(int i = 0; i < res.length; i++) {
            for(int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m  = nums.length;
        int n = nums[0].length;
        if((m*n) != (r *c)) {
            return nums;
        } else {
            int[] arr = new int[m * n];
            int k = 0;
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    arr[k++] = nums[i][j];
                }
            }
            k = 0;
            int[][] res = new int[r][c];
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    res[i][j] = arr[k++];
                }
            }

            return res;
        }
    }
}
