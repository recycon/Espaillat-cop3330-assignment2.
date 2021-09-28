package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */
import java.util.Random;
import java.util.Scanner;
public class Magicball {
    public static void magic(){
        Random rand = new Random();

        int x=rand.nextInt(4);
        if(x==0) {
            System.out.println("Yes");
        }
        if(x==1) {
            System.out.println("No");
        }
        if(x==2) {
            System.out.println("Maybe");
        }
        if(x==3){
            System.out.println("Ask again later.");
        }

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("What's your question? ");
        System.out.print(">");
        String b=in.next();
        magic();


    }


}
