package org.example;
import java.util.Scanner;
import java.lang.Math;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Compoundinterest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        int principalAmount = input.nextInt();
        System.out.print("What is the rate? ");
        double rate = input.nextDouble();
        System.out.print("What is the number of years? ");
        int year = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int number = input.nextInt();
        double invest = principalAmount*Math.pow((1+(rate/100)/number),number*year);
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",
                principalAmount, rate, year, number, invest);
    }
}
