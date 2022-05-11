package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SmallestStringWithSwaps {
    public static void main(String[] args) {
        SmallestStringWithSwaps smallestStringWithSwaps = new SmallestStringWithSwaps();
        String s = "dcab";
        List<List<Integer>> pairs = new ArrayList<>();
        List<Integer> pair = new ArrayList<>();
        pair.add(0);
        pair.add(3);
        pairs.add(pair);
        pair = new ArrayList<>();
        pair.add(1);
        pair.add(2);
        pairs.add(pair);
        pair = new ArrayList<>();
        pair.add(0);
        pair.add(2);
        pairs.add(pair);
        String res = smallestStringWithSwaps.smallestStringWithSwaps(s, pairs);
        System.out.println(res);
    }

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        Collections.sort(pairs, (o1, o2) -> o1.get(0) - o2.get(0));

        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer(s);
        for(List<Integer> pair : pairs) {
            char temp;
            temp = sb.charAt(pair.get(0));
            sb.setCharAt(pair.get(0), sb.charAt(pair.get(1)));
            sb.setCharAt(pair.get(1), temp);
            list.add(sb.toString());
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return list.get(0);
    }
}
