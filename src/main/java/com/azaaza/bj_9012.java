package com.azaaza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class bj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String ps = br.readLine();
            sb.append(isValidVPS(ps)).append("\n");
        }

        System.out.print(sb);
    }

    private static String isValidVPS(String ps) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < ps.length(); i++) {
            char ch = ps.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        return stack.isEmpty() ? "Yes" : "NO";
    }
}
