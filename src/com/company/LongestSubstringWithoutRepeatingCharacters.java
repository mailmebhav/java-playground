package com.company;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String args[]) {
        String s = "pwwew";

        if(s.length() == 0) {
//            return 0;
            System.out.println(0);
        }
        Set<Character> set = new HashSet<>();
        int start = 0;
        int max = 0;
        int end = 0;
        while(end < s.length()) {
            if(!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }

            max = Math.max(max, end - start);
        }

//        return max;

        System.out.println(max);
    }

}
