package main.java;

public class CanConvertStringInKMoves {
    public static void main(String[] args) {
        String s = "input";
        String t = "ouput";
        int k = 9;

        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            count += Math.min(Math.abs(s.charAt(i) - t.charAt(i)), Math.abs(t.charAt(i) - s.charAt(i)));

        }

//        return count < k ? true : false;
        System.out.println(count < k ? true : false);
    }
}
