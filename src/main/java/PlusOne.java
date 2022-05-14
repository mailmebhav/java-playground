package main.java;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,9,9};

        int carry = 0;
        digits[digits.length - 1]++;
        for(int i = digits.length - 1; i >= 0; i--) {
            carry = digits[i] / 10;
            digits[i] %= 10;
            if(carry > 0 && i > 0) {
                digits[i-1] += 1;
                carry = 0;
            }
        }

        if(carry > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carry;
            for(int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i-1];
            }
//            return newDigits;
            Arrays.stream(newDigits).forEach(e -> System.out.print(e + " "));
        } else {
//            return digits;
            Arrays.stream(digits).forEach(e -> System.out.print(e + " "));
        }
    }
}
