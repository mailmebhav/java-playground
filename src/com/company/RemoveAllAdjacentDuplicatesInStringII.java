package com.company;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInStringII {
    public static void main(String[] args) {
        String s1 = "abcd";
        int k1 = 2;
        String s2 = "deeedbbcccbdaa";
        int k2 = 3;
        String s3 = "pbbcggttciiippooaais";
        int k3 = 2;

        RemoveAllAdjacentDuplicatesInStringII removeAllAdjacentDuplicatesInStringII = new RemoveAllAdjacentDuplicatesInStringII();
        String res1 = removeAllAdjacentDuplicatesInStringII.removeDuplicates(s1, k1);
        String res2 = removeAllAdjacentDuplicatesInStringII.removeDuplicates(s2, k2);
        String res3 = removeAllAdjacentDuplicatesInStringII.removeDuplicates(s3, k3);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

    public String removeDuplicates(String s, int k) {
        int l = s.length();
        char [] ch = s.toCharArray();
        int i, j;
        Stack<Integer> st = new Stack<Integer>();
        st.push(0);
        for (i = 1, j = 1; j < l; i++, j++) {
            ch[i] = ch[j];
            if (i == 0 || ch[i] != ch[i-1]) {
                st.push(i);
            }
            else if ((i-st.peek()+1) == k)
                i = st.pop()-1;
        }
        return String.valueOf(ch, 0, i);
    }
}
