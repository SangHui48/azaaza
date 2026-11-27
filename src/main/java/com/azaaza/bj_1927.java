package com.azaaza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1927 {
  
  static int[] heap = new int[100001];
  static int size = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(br.readLine());
      if(x == 0) {
        sb.append(pop()).append("\n");
      } else {
        push(x);
      }
    }
    System.out.println(sb);
    
  }

  static void push(int x) {
    size += 1;
    heap[size] = x;

    int current = size;

    while (current > 1) {
      int parent = current / 2;

      if (heap[parent] <= heap[current]) {
        break;
      }

      swap(parent, current);
      current = parent;
    }
  }

  static int pop() {
    if (size == 0) {
      return 0;
    }

    int min = heap[1];

    heap[1] = heap[size];
    size -= 1;

    int current = 1;

    while (current * 2 <= size) {
      int left = current * 2;
      int right = current * 2 + 1;

      int child = left;

      if (right <= size && heap[right] < heap[left]) {
        child = right;
      }

      if (heap[current] <= heap[child]) {
        break;
      }

      swap(current, child);
      current = child;
    }

    return min;
  }

  static void swap(int a, int b) {
    int tmp = heap[a];
    heap[a] = heap[b];
    heap[b] = tmp;
  }
  
}
