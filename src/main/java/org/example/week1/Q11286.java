package org.example.week1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q11286 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((n1, n2) -> {
            int abs1 = Math.abs(n1);
            int abs2 = Math.abs(n2);

            return abs1 == abs2 ? Integer.compare(n1, n2) : Integer.compare(abs1, abs2);
        });

        for (int i = 0; i < size; i++) {
            int n = scanner.nextInt();
            if (n == 0) {
                outputQueue(priorityQueue);
            }
            else{
                priorityQueue.add(n);
            }
        }

        scanner.close();
    }

    private static void outputQueue(PriorityQueue<Integer> priorityQueue){
        if (priorityQueue.size() != 0) System.out.println(priorityQueue.poll());
        else System.out.println("0");
    }
}
