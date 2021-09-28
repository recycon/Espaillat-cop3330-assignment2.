package ex25;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */

public class app25 {

    public static void passwordValidator(String a){
        int count=0;
        try
        {
            Integer.parseInt(a);
            System.out.println("The password "+a+" is a very weak password.");
        }
        catch (NumberFormatException e)
        {
            if(a.length()<8){
                System.out.println("The password "+a+" is a weak password.");
            }
            for(int i=0;i<a.length();i++)
              {
                if(a.charAt(i) >= '0' && a.charAt(i) <= '9')
                {
                    count++;
                }
              }
            Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
            Matcher m=special.matcher(a);
            boolean x=m.find();
            if(count>=1 && a.length()>8 && x==false)
                System.out.print("The password "+a+" is a strong password.");

            if(count>=1 && a.length()>8 && x==true){
                System.out.println("The password "+a+" is a very strong password.");
            }
        }
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    System.out.print("Password : ");
    String a= in.next();
    passwordValidator(a);
    }











}
