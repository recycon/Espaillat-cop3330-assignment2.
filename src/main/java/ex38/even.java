package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */


import java.util.Scanner;

public class even {
    public static int[]filterEvenNumbers(int []b, int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] / 2 == 0) {
                k++;
            }
        }
        int[] v = new int[k];
        for (int i = 0; i < n; i++) {
            if (b[i] % 2 == 0) {
                for (int j = 0; j < k; j++) {
                    v[j] = b[i];
                    System.out.print(v[j]+" ");
                }
            }
        }


        return v;
    }



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[]=new int[8];
        System.out.print("Enter a list of numbers, separated by spaces: ");
        for(int i=0;i<8;i++){
            a[i]= in.nextInt();
        }

        System.out.print("The even numbers are ");
        int []c=filterEvenNumbers(a,8);


        }



        }



