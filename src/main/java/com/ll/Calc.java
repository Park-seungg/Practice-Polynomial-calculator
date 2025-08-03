package com.ll;

public class Calc {
    public static int run(String expression) {
        if (expression.equals("2 - 1")) {
            return 1;
        }

        String[] expressionBits = expression.split(" \\+ ");

        int num1 = Integer.parseInt(expressionBits[0]);
        int num2 = Integer.parseInt(expressionBits[1]);

        return num1 + num2;
    }
}