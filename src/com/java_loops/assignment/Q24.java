package com.java_loops.assignment;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter a number (0 to stop): ");
        int num = in.nextInt();

        while (num != 0) {
            sum += num;
            System.out.print("Enter a number (0 to stop): ");
            num = in.nextInt();
        }

        System.out.println("Sum of all numbers: " + sum);
        in.close();
    }
}