package com.company;

import java.util.Scanner;
import java.util.*;

public class Vowelcons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("enter the charecter = " +ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        System.out.println(ch + " is vowel");
        else System.out.println(ch + " is consonant");
    } }

