package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (j < k) {
                if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }

                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    result.add(l);
                    j++;
                    k--;
                }
            }
        }

//        return result;
        System.out.print("{");
        for(int i = 0; i < result.size(); i++) {
            System.out.print("[");
            for(int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + (j < result.get(i).size() - 1 ? "," : ""));
            }
            System.out.print("]" + (i < result.size() -1 ? "," : ""));
        }

        System.out.print("}");
    }
}
