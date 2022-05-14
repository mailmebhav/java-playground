package main.java;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] nums1 = {3, 6, 1, 0};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1};

        LargestNumberAtLeastTwiceOfOthers largestNumberAtLeastTwiceOfOthers = new LargestNumberAtLeastTwiceOfOthers();

        System.out.println(largestNumberAtLeastTwiceOfOthers.dominantIndex(nums1));
        System.out.println(largestNumberAtLeastTwiceOfOthers.dominantIndex(nums2));
        System.out.println(largestNumberAtLeastTwiceOfOthers.dominantIndex(nums3));
    }


    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(i != maxIndex) {
                if(nums[i] * 2 <= max) {
                    continue;
                } else {
                    return -1;
                }
            }
        }

        return maxIndex;
    }
}
