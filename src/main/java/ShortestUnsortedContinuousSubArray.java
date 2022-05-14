package main.java;

public class ShortestUnsortedContinuousSubArray {
    public static void main(String[] args) {
        ShortestUnsortedContinuousSubArray shortestUnsortedContinuousSubArray = new ShortestUnsortedContinuousSubArray();
//        int[] nums = {2,6,4,8,10,9,15};
        int[] nums = {1,2,3,3,3};
        int res = shortestUnsortedContinuousSubArray.findUnsortedSubarray(nums);
        System.out.println(res);
    }

    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int end = -1, max = nums[0];
        for (int i = 1; i < n; i++){
            if (nums[i] < max)
                end = i;
            else
                max = nums[i];
        }
        int start = 0, min = nums[n - 1];
        for (int i = n - 2; i >= 0; i--){
            if (nums[i] > min)
                start = i;
            else
                min = nums[i];
        }
        return end - start + 1;
    }

}
