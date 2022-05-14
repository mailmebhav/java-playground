package main.java;

import java.util.*;
import java.util.stream.Collectors;

public class Permutations2 {
    public static void main(String[] args) {
        Permutations2 permutations = new Permutations2();
        int[] nums = {1,2,3,4,5};
        int[] res = permutations.rotateArrayLeft(nums);
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        List<List<Integer>> list = permutations.permuteUnique(nums);

        list.forEach(e -> {
            System.out.println("");
            e.forEach(f -> {
                System.out.print(f);
            });
        });
    }
    Set<List> set;
    public List<List<Integer>> permuteUnique(int[] nums) {
        set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        permute(list, 0);
        return new ArrayList(set);
    }

    public void permute(List<Integer> list, int start) {
        if(start == list.size()) {
            set.add(new ArrayList(list));
        }

        for(int i = start; i < list.size(); i++) {
            Collections.swap(list, start, i);
            permute(list, start + 1);
            Collections.swap(list, i, start);
        }
    }

    public int[] rotateArrayLeft(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = nums.length - 2; i >= 0; i--) {
            res[i] = nums[i + 1];
        }
        res[nums.length - 1] = nums[0];

        return res;
    }
}
