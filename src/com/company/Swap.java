package com.company;
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number:");
        int first= sc.nextInt();
        System.out.print("Enter second number: ");
        int second= sc.nextInt();
        System.out.println("Before swap");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        System.out.println("After swap");
        System.out.println("First number = " + second);
        System.out.println("Second number = " + first);
    }
}

