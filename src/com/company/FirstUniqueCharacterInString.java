package com.company;

import java.util.Arrays;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        FirstUniqueCharacterInString firstUniqueCharacterInString = new FirstUniqueCharacterInString();
        String s = "leetcode";
        int res = firstUniqueCharacterInString.firstUniqChar(s);
        System.out.println(res);
    }

    public int firstUniqChar(String s) {
        int[] map = new int[26];
        Arrays.fill(map, 0);
        for(int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            if(map[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
