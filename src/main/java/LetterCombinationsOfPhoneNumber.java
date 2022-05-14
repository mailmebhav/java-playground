package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        LetterCombinationsOfPhoneNumber letterCombinationsOfPhoneNumber = new LetterCombinationsOfPhoneNumber();
        List<String> result = letterCombinationsOfPhoneNumber.letterCombinations(digits);
        result.stream().forEach(e -> System.out.print(e + ", "));
    }

    public List<String> letterCombinations(String digits) {
        List<String> letters = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return letters;
        }
        letters.add("");

        Map<Integer, String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        for(int i = 0; i < digits.length(); i++) {
            List<String> temp = new ArrayList<>();
            int c = Integer.parseInt(String.valueOf(digits.charAt(i)));
            String option = map.get(c);
            for(int j = 0; j < letters.size(); j++) {
                for (int k = 0; k < option.length(); k++) {
                    temp.add(new StringBuilder(letters.get(j)).append(option.charAt(k)).toString());
                }
            }

            letters.clear();
            letters.addAll(temp);
        }

        return letters;
    }
}
