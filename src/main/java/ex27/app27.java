package ex27;
//The first name must be filled in.
//The last name must be filled in.
//The first and last names must be at least two characters long.
//An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
//The ZIP code must be a number.

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */

import java.util.Scanner;

public class app27 {
    public static int fn(String a){
        if(a.length()<2){
            System.out.println("The first name must be at least 2 characters long.");
            if(a.isEmpty()){
                System.out.println("The first name must be filled in.");
            }
        }
        else return 1;

        return 0;
    }

    public static int ln(String b){
        if (b.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            if(b.isEmpty()){
                System.out.println("The last name must be filled in.");
            }
        }
        else return 1;

        return 0;
    }
    //try return for no errors ex 0
    public static int zip(String a){
        try
        {
            Integer.parseInt(a);
            return 1;
        }
        catch (NumberFormatException e)
        {
            System.out.println("The zipcode must be a 5 digit number.");
        }
        return 0;

    }

    public static int id(String a){
        if(!a.matches("[A-Z]{2}-\\d{4}")){
            System.out.println("The employee ID must be in the format of AA-1234");
        }
        else return 1;

        return 0;

        
    }

    public static void validateInput(String id,String zip,String fn,String ln){
        int x,y,w,z;
        w=fn(fn);
        z=ln(ln);
        x=id(id);
        y=zip(zip);
        if(x==1 && y==1 && w==1 && z==1){
            System.out.println("There were no errors found.");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Enter the first name: J
        //Enter the last name:
        //Enter the ZIP code: ABCDE
        //Enter the employee ID: A12-1234
        String id,zip,fn,ln;
        System.out.print("Enter the first name: ");
        fn=in.nextLine();
        System.out.print("Enter the last name: ");
        ln=in.nextLine();
        System.out.print("Enter the ZIP code:  ");
        zip=in.next();
        System.out.print("Enter the employee ID: ");
        id=in.next();
        validateInput(id,zip,fn,ln);


    }
}
