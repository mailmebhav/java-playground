package com.company;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 1};
        MaxConsecutiveOnes maxConsecutives = new MaxConsecutiveOnes();
        maxConsecutives.findMaxConsecutiveOnes(nums);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int j = 0;
        int zero = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            }
            while (zero > 1) {
                if (nums[j] == 0) {
                    zero--;
                }
                j++;
            }
            max = Math.max(i - j + 1, max);
        }

        return max;
    }
}
