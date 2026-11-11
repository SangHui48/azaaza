package com.azaaza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine());

        int[] stack =  new int[n];
        int top = -1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");

            switch(command[0]) {
                case "push":
                    int x = Integer.parseInt(command[1]);
                    stack[++top] = x;
                    break;

                case "pop":
                    if (top == -1){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack[top--]).append("\n");
                    }
                    break;

                case "size":
                    sb.append(top + 1).append("\n");
                    break;

                case "empty":
                    sb.append(top == -1 ? 1 : 0).append("\n");
                    break;

                case "top":
                    sb.append(top == -1 ? -1 : stack[top]).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}