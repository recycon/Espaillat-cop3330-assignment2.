package ex24;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */
//Enter two strings and I'll tell you if they are anagrams:
//Enter the first string: note
//Enter the second string: tone
//"note" and "tone" are anagrams.


import java.util.Scanner;

public class App1 {
    public static int isAnagram(String a, String b) {
        int x=a.length();
        int y=b.length();
        if(x==y){
            System.out.println(a+"and "+b+" are anagrams.");
            return 1;
        }
        else
            System.out.println(a+" and "+b+" are not anagrams.");
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a,b;
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        a=in.next();
        System.out.print("Enter the second string: ");
        b=in.next();
        isAnagram(a,b);
    }


}
