package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */
import java.util.Scanner;

public class AddingNum {

    public static int addNum(){
        Scanner in=new Scanner(System.in);
        int y=0;
        int x[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter a number: ");
            x[i]=in.nextInt();
            y+=x[i];
        }

           return y;

    }


    public static void main(String[] args) {
        int d=addNum();
        System.out.println("The total is "+d+".");

    }

}
