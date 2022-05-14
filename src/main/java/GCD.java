package main.java;

public class GCD {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        int res = gcd.calculateGCD(2,10);
        System.out.println(res);
    }

    public int calculateGCD(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }

}
