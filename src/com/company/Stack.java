package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack {

    List<Integer> stackList = new ArrayList<>();

    public void showMenu() {
        System.out.println("Stack!");
        System.out.println("Menu:");
        System.out.println("1. Show Items");
        System.out.println("2. Push an Element to Stack");
        System.out.println("3. Pop an Element from Stack");
        System.out.println("4. Exit");
    }

    public void displayElements() {
        for(int i = 0; i < stackList.size(); i++) {
            System.out.print(stackList.get(i) + " ");
        }
    }

    public void push(int element) {
        System.out.println("");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        int selectedMenuOption = 0;
        Scanner scanner = new Scanner(System.in);
        while(selectedMenuOption != 4) {
            stack.showMenu();
            selectedMenuOption = scanner.nextInt();
            switch (selectedMenuOption) {
                case 1: System.out.println("All the Elements in Stack are\n");
                        stack.displayElements();
                        break;
                case 2: System.out.println("Please type the element to be inserted in Stack");
                        stack.push(scanner.nextInt());
                        break;
            }
        }
    }
}
