package main.java;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {
        Map<Integer, Integer> freqMap = new HashMap();
        int[] nums = {1,1,1,2,2,3};
        for(int i = 0; i < nums.length; i++) {
            if(freqMap.containsKey(nums[i])) {
//                freqMap.put(nums[i],freqMap.get(nums[i])++);
            }
        }
    }
}
