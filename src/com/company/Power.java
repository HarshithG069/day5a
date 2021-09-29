package com.company;
import java.util.*;
public class Power {
    public static void main(String[] args) {

        int base = 2;

        long result = 1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter  number ");
        int exponent= sc.nextInt();

        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}

