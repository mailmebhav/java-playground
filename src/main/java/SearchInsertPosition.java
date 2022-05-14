package main.java;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int res = searchInsertPosition.searchInsert(nums, target);
        System.out.println(res);
    }

    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        if(nums.length == 1) {
            if(nums[0] >= target) {
                return 0;
            } else {
                return 1;
            }
        }
        int m = 0;
        while(l <= r) {
            m = l + (r-l)/2;
            if(nums[m] == target) {
                return m;
            } else if(nums[m] > target) {
                r = m - 1;
            } else {
                l = l + 1;
            }
        }

        return target > nums[m] ? m + 1 : m;
    }
}
