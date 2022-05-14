package main.java;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.maxSumArray(nums));
    }

    public int maxSumArray(int[] nums) {
        int maxSum = nums[0];
        int tempSum = nums[0];
        for(int i = 1;i < nums.length; i++) {
            tempSum = Math.max(nums[i], tempSum + nums[i]);
            maxSum = Math.max(maxSum, tempSum);
        }

        return maxSum;
    }
}
