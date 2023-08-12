package com.workintech.stacks.stack;

import java.util.Stack;

public class DecimalToBinary {

    public static String convertToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int[] decimalNumbers = { 5, 6, 13, 30, 100 };

        for (int num : decimalNumbers) {
            System.out.println(num + " in binary: " + convertToBinary(num));
        }
    }
}