package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Deviation {




    public static int max(int[] b,int n){
        int x=0;
        int j=0;
        x=b[0];
        for(int i =1;i<n;i++) {
            if (b[i] > x) {
                x = b[i];
            }
        }


        return x;

    }
    public static int min(int[] b,int n){
        int x=0;
        int j=0;
        x=b[0];
        for(int i =1;i<n;i++) {
            if (b[i] < x) {
                x = b[i];
            }
        }


        return x;

    }

    public static double avg(int []b,int n){
        double x=0;
        for(int i=0;i<n;i++) {
            x += b[i];
        }
        x=x/n;
        return x;

    }

    public static double std(double avg, int n,int []b){
        double x=0;
        double t;
        for(int i=0;i<n;i++){
            t=b[i]-avg;
            x+=Math.pow(t,2);
        }
        double c=x/(n);
        c=Math.sqrt(c);
        return c;

    }






    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = 0;
        int n=0;
        int b[]=new int[10];
        String a;
        while (v < 100) {
            System.out.print("Enter a number: ");
            a = in.nextLine();
            if (a.equals("done")) {
                v = 101;
            }
            else {
                b[n] = Integer.parseInt(a);
                n++;
            }
        }

        System.out.print("Numbers: ");
        int i=0;


        while(i<n) {
            System.out.print(b[i] + "  ");
            i++;
        }

        System.out.println("\nThe average is "+avg(b,n));
        System.out.println("The maximum is "+max(b,n));
        System.out.println("The minimum is "+min(b,n));
        double x=avg(b,n);
        double g=std(x,n,b);
        System.out.print("The standard deviation is ");
        System.out.printf("%.2f", g);

    }



}
