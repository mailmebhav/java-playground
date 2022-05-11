package com.company;

public class LargestComponentSizeByCommonFactor {
    public static void main(String[] args) {
        LargestComponentSizeByCommonFactor largestComponentSizeByCommonFactor = new LargestComponentSizeByCommonFactor();
        int[] nums = {4,6,15,35};
        int res = largestComponentSizeByCommonFactor.largestComponentSize(nums);
        System.out.println(res);
    }

    public int largestComponentSize(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int gcd = calcGCD(nums[i], nums[j]);
                if(gcd > 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public int calcGCD(int a, int b) {
        if(b == 0) {
            return a;
        }else {
            return calcGCD(b, a % b);
        }
    }
}
