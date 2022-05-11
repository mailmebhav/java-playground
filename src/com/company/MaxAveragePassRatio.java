package com.company;

public class MaxAveragePassRatio {
    public static void main(String[] args) {
        int[][] classes = {{2,4}, {3,9},{4,5},{2,10}};
        int extraStudents = 4;
        MaxAveragePassRatio maxAveragePassRatio = new MaxAveragePassRatio();
        double maxRatio = maxAveragePassRatio.maxAverageRatio(classes, extraStudents);
        System.out.println(maxRatio);
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        double[] passRatios = new double[classes.length];
        int minStudents = Integer.MAX_VALUE;
        int minStudentsClass = -1;
        for(int i = 0; i < classes.length; i++) {
            passRatios[i] = (double)classes[i][0] / classes[i][1];
            if(classes[i][1] < minStudents) {
                minStudents = classes[i][1];
                minStudentsClass = i;
            }
        }

        passRatios[minStudentsClass] =  ((double)(classes[minStudentsClass][0] + extraStudents) / (classes[minStudentsClass][1] + extraStudents));
        double totalPassRatio = 0;
        for(int i = 0; i < classes.length; i++) {
            totalPassRatio += passRatios[i];
        }

        return totalPassRatio / classes.length;
    }
}
