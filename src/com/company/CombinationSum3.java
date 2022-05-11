package com.company;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
        CombinationSum3 combinationSum3 = new CombinationSum3();
        int k = 3;
        int n = 9;
        List<List<Integer>> res = combinationSum3.combinationSum3(k, n);
        for (List<Integer> list : res) {
            System.out.println("[");
            for (Integer integer : list) {
                System.out.println(integer);
            }
            System.out.println("]");
        }
    }


    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        int start = 1;
        findCombinations(result, comb, k, n, start);
        return result;
    }

    public void findCombinations(List<List<Integer>> result, List<Integer> comb,int k, int n, int start) {
        if (k == comb.size() && n == 0) {
            result.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i < 10; i++) {
            comb.add(i);
            findCombinations(result, comb, k, n - i, i + 1);
            comb.remove(comb.size() - 1);
        }
    }


}
