package main.java;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {2, 1, -1};

        FindPivotIndex findPivotIndex = new FindPivotIndex();
        System.out.println(findPivotIndex.pivotIndex(nums1));
        System.out.println(findPivotIndex.pivotIndex(nums2));
        System.out.println(findPivotIndex.pivotIndex(nums3));
    }

    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int[] suffixSum = new int[nums.length];
        prefixSum[0] = 0;
        suffixSum[nums.length - 1] = 0;
        for(int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        for(int i = nums.length - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i + 1];
        }

        for(int i = 0; i < nums.length; i++) {
            if(prefixSum[i] == suffixSum[i]) {
                return i;
            }
        }

        return -1;
    }
}
