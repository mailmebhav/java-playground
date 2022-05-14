package main.java;

public class MinDominoRotationsEqualRow {
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1, 1, 2, 2, 2};
        int[] B = {2, 1, 2, 2, 2, 2, 2, 2};


        MinDominoRotationsEqualRow minDominoRotationsEqualRow = new MinDominoRotationsEqualRow();
        System.out.println(minDominoRotationsEqualRow.minDominoRotations(A, B));
    }

    public int minDominoRotations(int[] A, int[] B) {
        int[] aEntry = new int[6];
        int[] bEntry = new int[6];
        for (int i = 0; i < A.length; i++) {
            aEntry[A[i] - 1]++;
            bEntry[B[i] - 1]++;
        }
        int maxA = 0;
        int maxB = 0;
        int maxAdigit = 0;
        int maxBdigit = 0;
        for (int i = 0; i < 6; i++) {
            if (aEntry[i] > maxA) {
                maxA = aEntry[i];
                maxAdigit = i + 1;
            }
            if (bEntry[i] > maxB) {
                maxB = bEntry[i];
                maxBdigit = i + 1;
            }
        }
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < A.length; i++) {
            if (maxA > maxB) {
                if (A[i] != maxAdigit) {
                    if (B[i] == maxAdigit) {
                        countA++;
                    } else {
                        return -1;
                    }
                }
            } else {
                if (B[i] != maxBdigit) {
                    if (A[i] == maxBdigit) {
                        countB++;
                    } else {
                        return -1;
                    }
                }
            }
        }
        if (countA > 0) {
            if (countB > 0) {
                return countA < countB ? countA : countB;
            } else
                return countA;
        } else if (countB > 0) {
            return countB;
        } else if(countA ==  0 && countB == 0) {
            return 0;
        } else
            return -1;
//        return countA < countB ? countA : countB;
    }
}
