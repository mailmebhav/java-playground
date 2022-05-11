package com.company;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        ValidAnagram validAnagram = new ValidAnagram();
        boolean res = validAnagram.isAnagram(s,t);
        System.out.println(res);
    }

    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        Arrays.fill(map, 0);
        if(s.length() != t.length()) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < map.length; i++) {
            if(map[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
