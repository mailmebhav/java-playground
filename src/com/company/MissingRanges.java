package com.company;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static void main(String[] args) {
//        int[] nums = {0,1,3,50,75};
        int[] nums = {};
        int lower = 1;
        int upper = 1;
        MissingRanges missingRanges = new MissingRanges();
        List<String> list = missingRanges.findMissingRanges(nums, lower, upper);
        for (String s : list) {
            System.out.println(s);
        }

    }

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int prev = lower - 1;
        for (int i = 0; i <= nums.length; i++) {
            int curr = (i < nums.length) ? nums[i] : upper + 1;
            if (prev + 1 <= curr - 1) {
                result.add(formatRange(prev + 1, curr - 1));
            }
            prev = curr;
        }
        return result;
    }

    // formats range in the requested format
    private String formatRange(int lower, int upper) {
        if (lower == upper) {
            return String.valueOf(lower);
        }
        return lower + "->" + upper;
    }
//    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
//        int k = 0;
//        List<String> res = new ArrayList<>();
//        for(int i = lower; i <= upper; i++) {
//            if(k > nums.length - 1) {
//                if(i < upper) {
//                    res.add(Integer.toString(i) + "->" + Integer.toString(upper));
//                } else if(i == upper) {
//                    res.add(Integer.toString(upper));
//                }
//                return res;
//            }
//            if(nums[k] != i) {
//                String x = Integer.toString(i);
//                while(i != nums[k]) {
//                    i++;
//                }
//                String y = Integer.toString(i - 1);
//                if(x.equals(y)) {
//                    res.add(x);
//                } else {
//                    res.add(x + "->" + y);
//                }
//                k++;
//            } else {
//                k++;
//            }
//        }
//
//        return res;
//    }


}
