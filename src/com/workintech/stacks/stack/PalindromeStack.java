package com.workintech.stacks.stack;

import java.util.Locale;
import java.util.Stack;

public class PalindromeStack {
    public static void main(String[] args) {
        String input1 = "I did, did I?";
        String input2 = "Racecar";
        String input3 = "hello";
        String input4 = "Was it a car or a cat I saw ?";

        System.out.println(isPalindrome(input1));
        System.out.println(isPalindrome(input2));
        System.out.println(isPalindrome(input3));
        System.out.println(isPalindrome(input4));
    }

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase(Locale.ENGLISH).replaceAll("[^a-zA-Z0-9]", "");
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }

        return true;
    }
}
