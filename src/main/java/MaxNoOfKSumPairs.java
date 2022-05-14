package main.java;

import java.util.HashMap;
import java.util.Map;

public class MaxNoOfKSumPairs {
    public static void main(String[] args) {
        MaxNoOfKSumPairs maxNoOfKSumPairs = new MaxNoOfKSumPairs();
        int[] nums = {2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2};
        int k = 3;
        int res = maxNoOfKSumPairs.maxOperations(nums, k);
        System.out.println(res);
    }

    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int complement = k - nums[i];
            if(map.containsKey(complement)) {
                if(map.getOrDefault(complement, 0) > 1) {
                    map.put(complement, map.getOrDefault(complement, 0) - 1);
                } else {
                    map.remove(complement);
                }
                if(map.getOrDefault(nums[i], 0) > 1) {
                    map.put(nums[i], map.getOrDefault(nums[i], 0) - 1);
                } else {
                    map.remove(nums[i]);
                }
                count++;
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }

        return count;
    }
}
