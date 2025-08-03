package com.ll;

public class Calc {
    public static int run(String expression) {
        expression = expression.replaceAll(" ", "");
        String[] bits = expression.split("(?=[-+])"); // + 또는 - 앞에서 split
        int result = Integer.parseInt(bits[0]);
        for (int i = 1; i < bits.length; i++) {
            String token = bits[i];
            if (token.startsWith("+")) {
                result += Integer.parseInt(token.substring(1));
            } else if (token.startsWith("-")) {
                result -= Integer.parseInt(token.substring(1));
            }
        }
        return result;
    }
}