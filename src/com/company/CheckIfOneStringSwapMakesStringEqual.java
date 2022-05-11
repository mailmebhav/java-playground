package com.company;

public class CheckIfOneStringSwapMakesStringEqual {
    public static void main(String[] args) {
        CheckIfOneStringSwapMakesStringEqual checkIfOneStringSwapMakesStringEqual = new CheckIfOneStringSwapMakesStringEqual();
        String s1 = "bank";
        String s2 = "kanb";
        boolean result = checkIfOneStringSwapMakesStringEqual.areAlmostEqual(s1,s2);
        System.out.println(result);
    }

    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
            sum1 += 'a' - s1.charAt(i);
            sum2 += 'a' - s2.charAt(i);
        }

        if (s1.length() == 2 && count == 2) {
            if (s1.charAt(0) == s2.charAt(1) && s1.charAt(1) == s2.charAt(0)) {
                return true;
            } else {
                return false;
            }
        }

        return (count == 2 || count == 0) && (sum1 == sum2) ? true : false;
    }
}
