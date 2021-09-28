package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PickWinner {

    public static String Pickem(int ran, String [] a){
        return a[ran];



    }

    public static void main(String[] args) {
        String[] a = new String[10];
        Scanner in = new Scanner(System.in);
        int t=0;
        int r = 0;
        while (r < 1000) {
            System.out.print("Enter a name: ");
            a[r] = in.nextLine();
            if (a[r].isEmpty()) {
                r = 1001;
            }
            r++;
            t++;
        }
        Random rand = new Random();
        int x=rand.nextInt(t);
        String z=Pickem(x, a);
        System.out.println("The winner is... "+z+".");

    }




}
