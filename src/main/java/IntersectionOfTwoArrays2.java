package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        IntersectionOfTwoArrays2 intersectionOfTwoArrays2 = new IntersectionOfTwoArrays2();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] res = intersectionOfTwoArrays2.intersect(nums1, nums2);
        Arrays.stream(res).forEach(e -> System.out.print(e + " "));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        while(p1 < nums1.length && p2 < nums2.length) {
            if(nums1[p1] > nums2[p2]) {
                p2++;
            } else if(nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
        }

        return list.stream().mapToInt(e->e).toArray();
    }
}
