package com.java_loops.assignment;

// Q2 Area Of Triangle

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the height: ");
        double h = in.nextDouble();

        System.out.print("Enter the Base: ");
        double b = in.nextDouble();

        double area;
        area = (h * b) / 2;

        System.out.print("Area of the Triangle: " + area);

    }
}
