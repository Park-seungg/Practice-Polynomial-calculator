package com.ll;

public class Calc {
    public static int run(String expression) {
        expression = expression.replaceAll(" ", "");
        if (expression.contains("-")) {
            String[] bits = expression.split("-");
            int result = Integer.parseInt(bits[0]);
            for (int i = 1; i < bits.length; i++) {
                result -= Integer.parseInt(bits[i]);
            }
            return result;
        } else {
            String[] bits = expression.split("\\+");
            int result = Integer.parseInt(bits[0]);
            for (int i = 1; i < bits.length; i++) {
                result += Integer.parseInt(bits[i]);
            }
            return result;
        }
    }
}