package main.java;

public class GameOfBookCricket {
    public static void main(String[] args) {
        System.out.println(noOfWaysToDrawTheGame(10));
    }

    private static int noOfWaysToDrawTheGame(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        } else if(n == 1) {
            return 0;
        } else if(n == 2) {
            return 1;
        } else {
            return noOfWaysToDrawTheGame(n-2)+noOfWaysToDrawTheGame(n-4)+noOfWaysToDrawTheGame(n-6);
        }
    }
}
