package com.azaaza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11286 {

  static int[] heap = new int[100001];
  static int size = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(br.readLine());
      
      if (x == 0) {
        sb.append(pop()).append("\n");
      } else {
        push(x);
      }
    }
    System.out.print(sb);
  }

  static void push(int x) {
    size += 1;
    heap[size] = x;

    int current = size;
    
    while (current > 1) {
      int parent = current / 2;
      
      if (isSmaller(heap[current], heap[parent])) {
        swap(current, parent);
        current = parent;
      } else {
        break;
      }
    }
  }

  static int pop() {
    if (size == 0) {
      return 0;
    }
    
    int result = heap[1];

    heap[1] = heap[size];
    size -= 1;

    int current = 1;

    while (current * 2 <= size) {
      int left =  current * 2;
      int right = current * 2 + 1;
      int child = left;

      if (right <= size && isSmaller(heap[right], heap[left])) {
        child = right;
      }

      if (isSmaller(heap[child], heap[current])) {
        swap(current, child);
        current = child;
      } else {
        break;
      }
    }
    return result;
  }

  static boolean isSmaller(int x, int target) {
    int absX = Math.abs(x);
    int absTarget = Math.abs(target);

    if (absX == absTarget) {
      return x < target;
    }
    return absX < absTarget;
  }

  static void swap(int a, int b) {
    int tmp = heap[a];
    heap[a] = heap[b];
    heap[b] = tmp;
  }
  
}
