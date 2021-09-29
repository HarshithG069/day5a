package com.company;
import java.util.Scanner;
import java.util.*;
public class Flipcoin {
    public static void main(String[] args)
    {
        int heads = 0;
       int  percentageofheads;
       int  percentageoftails;
        int tails = 0;
        int counter = 1;
        double randNum = 0.0;

        for(int i=1;i<=5;i++) {{
                randNum = Math.random();
                System.out.print(counter + "\t" + randNum);

                if (randNum < .5) {
                    heads++;
                    System.out.println("\t heads");
                } else {
                    tails++;
                    System.out.println("\t tails");
                }
                counter++;
            }
            System.out.println();
            System.out.println("Number of Heads = " + heads);
            System.out.println("Number of Tails = " + tails);
            percentageofheads = ((heads * 100) / 5);
            percentageoftails = ((tails * 100) / 5);
            System.out.println("percentage of Heads = " + percentageofheads);
            System.out.println("percentage of Tails = " + percentageoftails);


        }

    }
}