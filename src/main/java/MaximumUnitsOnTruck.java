package main.java;

public class MaximumUnitsOnTruck {
    public static void main(String[] args) {
        MaximumUnitsOnTruck maximumUnitsOnTruck = new MaximumUnitsOnTruck();
        int[][] boxTypes = {{1,3},{2, 2},{3, 1}};
        int truckSize = 4;
        int maxNoOfUnits = maximumUnitsOnTruck.maximumUnits(boxTypes, truckSize);
        System.out.println(maxNoOfUnits);
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        return 0;
    }
}
