package com.workintech.stacks.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueuePalindrome {

    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch);
                queue.add(ch);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] testStrings = {
                "I did, did I?",
                "Racecar",
                "hello",
                "Was it a car or a cat I saw ?"
        };

        for (String test : testStrings) {
            System.out.println(test + " is palindrome: " + isPalindrome(test));
        }
    }
}
