package com.azaaza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class bj_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> nameSet = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            nameSet.add(br.readLine());
        }

        int answer = 0;

        for (int i = 1; i <= m; i++) {
            String name = br.readLine();

            if (nameSet.contains(name)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
