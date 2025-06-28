package com.java_loops.assignment;

// Q1 Area Of Circle Java Program

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Radius: ");
        double radius = in.nextInt();
        double pi = 3.142;
        double area;

        area = (int) (pi * radius * radius);
        System.out.println(area);

    }
}
