package ex32;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */
public class RandomNum {
    public static int valid(String a){
        Scanner in=new Scanner(System.in);
        try
        {
            int x=Integer.parseInt(a);
            return x;




        }
        catch (NumberFormatException e)
        {
            System.out.print("Please enter a valid input :");
            int b=in.nextInt();
            return b;

        }


    }


    public static int random(int a){
        Random rand = new Random();
        if(a==1){
            int x=rand.nextInt(11);
            return x;
        }

        if(a==2){
            int y=rand.nextInt(101);
            return y;


        }


        if(a==3){
            int b=rand.nextInt(1001);
            return b;

        }
        return 0;
    }
    public static int HL(int b,int ran){

        if (b > ran) {
            return 1;

        }

        if (ran > b) {
            return 2;
        }

        if (b == ran) {
            return 10;
        }

        return 0;
    }



    public static void guessG() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        int lvl = in.nextInt();
        int x = random(lvl);
        System.out.println(x+"");

        System.out.print("I have my number. What's your guess? ");
        String y = in.next();
        int w = 0;
        int r=0;
        int b=valid(y);
        if(b!=x){
            w=1;
        }

        while (r < 1) {




            if (b>x) {
                w++;
                System.out.print("Too high. Guess again: ");
                    y=in.next();
                    b=valid(y);


            }
            if (x>b) {
                w++;
                System.out.print("Too low. Guess again: ");
                y=in.next();
                b=valid(y);


            }
            if (x==b){
                r=2;
                System.out.println("You got it in "+w+" guesses!");
            }
            }




        }



    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");
        Scanner in=new Scanner(System.in);
        guessG();

        System.out.print("Do you wish to play again (Y/N)? ");
        String e=in.next();
        if(e.equals("y")|| e.equals("Y")){
           guessG();
        }

        if(e.equals("n")|| e.equals("N")){
            exit(0);
        }


    }
}
