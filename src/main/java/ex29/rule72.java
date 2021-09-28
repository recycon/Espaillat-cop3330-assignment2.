package ex29;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */
public class rule72 {
    public static int rule(String a){
        try
        {
            Integer.parseInt(a);
            if(a.equals("0")){
                System.out.println("Sorry. That's not a valid input.");
            }
            else return 1;
        }
        catch (NumberFormatException e)
        {
            System.out.println("Sorry. That's not a valid input.");
        }
        return 0;
    }

    public static int ruleLoop(){
        Scanner in= new Scanner(System.in);
        String d;
        int x;
        int y;
        int years;
        while(1<2){
            System.out.print("What is the rate of return? ");
            d= in.nextLine();
            x=rule(d);
            if(x==1){
                y=Integer.parseInt(d);
                years = 72 / y;
                System.out.println("It will take "+years +" years to double your initial investment.");
                return 0;
            }
        }
    }

    public static void main(String[] args){
        ruleLoop();

    }


}
