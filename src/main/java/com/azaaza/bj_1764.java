package com.azaaza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class bj_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> unheardSet = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            unheardSet.add(br.readLine());
        }

        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 1; i <= m; i++) {
            String name = br.readLine();

            if (unheardSet.contains(name)) {
                resultList.add(name);
            }
        }

        Collections.sort(resultList);

        StringBuilder sb = new StringBuilder();
        sb.append(resultList.size()).append("\n");

        for (String name : resultList) {
            sb.append(name).append("\n");
        }

        System.out.print(sb.toString());
    }
}
