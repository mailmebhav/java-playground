package com.company;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        FindAllDuplicatesInArray findAllDuplicatesInArray = new FindAllDuplicatesInArray();
        List<Integer> res = findAllDuplicatesInArray.findDuplicates(nums);
        res.stream().forEach(e -> System.out.print(e + " "));
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int pos = nums[i] - 1;
            if(nums[i] != nums[pos]) {
                swap(nums, i, pos);
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1) {
                list.add(nums[i]);
            }
        }

        return list;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
