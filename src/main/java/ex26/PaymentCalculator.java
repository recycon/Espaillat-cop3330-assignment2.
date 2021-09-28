package ex26;
////What is your balance? 5000
//What is the APR on the card (as a percent)? 12
//What is the monthly payment you can make? 100
//It will take you 70 months to pay off this card.

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */


import static java.lang.Math.log;
import java.util.Scanner;

public class PaymentCalculator {

    public static double calculateMonthsUntilPaidOff(double b, double i, int p){
        double n;
        i=(i/100)/365;
        double x=0.03333333333;



        n = -(x) * log(1 + b/p * (1 - Math.pow((1+i),30))) / log(1 + i);
        return n;



    }


    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("What is your balance? ");
        double b=in.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        float i=in.nextFloat();
        System.out.print("What is the monthly payment you can make? ");
        int p=in.nextInt();
        double x=calculateMonthsUntilPaidOff(b,i,p);
        int y= (int) Math.round(x);
        System.out.println("It will take you "+y +" months to pay off this card.");

    }

}
