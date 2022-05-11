package com.company;

import java.util.Arrays;

public class RansomNote {
    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        String ransomNoteString = "a";
        String magazine = "b";
        boolean res = ransomNote.canConstruct(ransomNoteString, magazine);
        System.out.println(res);
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        Arrays.fill(map, 0);
        for(int i = 0; i < magazine.length(); i++) {
            map[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            int idx = ransomNote.charAt(i) - 'a';
            if(map[idx] >= 1) {
                map[idx]--;
            } else {
                return false;
            }
        }

        return true;
    }
}
