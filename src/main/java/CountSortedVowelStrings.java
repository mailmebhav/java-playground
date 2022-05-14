package main.java;

public class CountSortedVowelStrings {
    public static void main(String[] args) {
        CountSortedVowelStrings countSortedVowelStrings = new CountSortedVowelStrings();
        int res = countSortedVowelStrings.countVowelStrings(3);
        System.out.println(res);
    }

    public int countVowelStrings(int n) {
        int[] arr = {1,1,1,1,1};
        int i = 1;
        int k = 3;
        while(i < n) {
            arr[k] += arr[k+1];
            k--;
            if(k == -1) {
                k = 3;
                i++;
            }
        }
        int sum = 0;
        for(i = 0; i < 5; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
