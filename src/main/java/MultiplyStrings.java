package main.java;

import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "999";
        String num2 = "999";

        if(num1 == "0" || num2 == "0") {
            System.out.println("0");
        }

        int[] result = new int[num1.length() + num2.length()];

        int i_n1 = 0;
        int i_n2;
        int carry = 0;
        for(int i = 0; i < num1.length(); i++) {
            int x = num1.charAt(i) - '0';
            i_n2 = 0;
            carry = 0;
            for(int j = 0; j < num2.length(); j++) {
                int y = num2.charAt(j) - '0';
                int sum = (x * y) + carry + result[i_n1 + i_n2];
                carry = sum / 10;
                result[i_n1 + i_n2] = sum % 10;
                i_n2++;
            }

            if (carry > 0) {
                result[i_n1 + i_n2] += carry;
            }
            i_n1++;
        }

        int m = result.length - 1;
        while(m >= 0 && result[m] == 0) {
            m--;
        }

        String res = "";
        while(m >= 0) {
            res += result[m--];
        }

        System.out.println(res);
    }
}
