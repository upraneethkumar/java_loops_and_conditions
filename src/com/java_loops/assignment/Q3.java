package com.java_loops.assignment;

// Q3 Area Of Rectangle Program

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double len = in.nextDouble();

        System.out.print("Enter the width: ");
        double wid = in.nextDouble();

        double area;

        area = len * wid;
        System.out.print("Area Of Rectangle: " + area);

    }
}
