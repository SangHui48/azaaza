package com.azaaza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10845 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        int n = Integer.parseInt(br.readLine());

        int[] queue = new int[n];

        int front = 0;
        int back = 0;

        for (int i = 0; i < n; i++) {

            String[] command = br.readLine().split(" ");

            switch (command[0]) {

                case "push":
                    int x = Integer.parseInt(command[1]);
                    queue[back++] = x;
                    break;

                case "pop":
                    if (front == back) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue[front++]);
                    }
                    break;

                case "size":
                    System.out.println(back - front);
                    break;

                case "empty":
                    System.out.println(front == back ? 1 : 0);
                    break;

                case "front":
                    System.out.println(front == back ? -1 : queue[front]);
                    break;

                case "back":
                    System.out.println(front == back ? -1 : queue[back - 1]);
                    break;
            }
        }

    }
}
