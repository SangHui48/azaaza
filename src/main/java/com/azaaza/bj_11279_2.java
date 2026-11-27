package com.azaaza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class bj_11279_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(br.readLine());

      if (x == 0) {
        if (heap.isEmpty()) {
          sb.append(0).append("\n");
        } else {
          sb.append(heap.poll()).append("\n");
        }
      } else {
        heap.add(x);
      }
    }
    System.out.println(sb.toString());
  }
  
}
