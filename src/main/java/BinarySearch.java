package main.java;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        BinarySearch binarySearch = new BinarySearch();
        int res = binarySearch.search(nums, target);
        System.out.println(res);
    }

    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while(l < h) {
            int m = (l+h)/2;
            if(nums[m] == target) {
                return m;
            } else if(nums[m] > target) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1;
    }
}
