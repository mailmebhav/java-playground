package main.java;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pattern132 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, -4, -3};
        Pattern132 pattern132 = new Pattern132();
        boolean res = pattern132.find132pattern(nums);
        System.out.println(res);

    }

    public boolean find132pattern(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return false;
        }

        Deque<Integer> stk = new ArrayDeque<>();

        int k = -1;
        for (int i = len - 1; i >= 0; i--) {
            if (k > -1 && nums[k] > nums[i]) {
                return true;
            }

            while (!stk.isEmpty() && nums[i] > nums[stk.peek()]) {
                k = stk.pop();
            }

            stk.push(i);
        }

        return false;
    }
}
