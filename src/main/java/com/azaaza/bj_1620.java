package com.azaaza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bj_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] numToName = new String[n + 1];
        HashMap<String, Integer> nameToNum = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String poketmon = br.readLine();
            numToName[i] = poketmon;
            nameToNum.put(poketmon, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String quiz = br.readLine();

            char firstChar = quiz.charAt(0);

            if (firstChar >= '0' && firstChar <= '9') {
                int number = Integer.parseInt(quiz);
                sb.append(numToName[number]).append("\n");
            } else {
                sb.append(nameToNum.get(quiz)).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
