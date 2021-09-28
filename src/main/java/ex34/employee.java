package ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */


import java.util.Scanner;

public class employee {

    public static void remover(String a[],String b){
        for(int i=0;i<5;i++){
            if(a[i].equals(b)){
               continue;
            }
            System.out.println(a[i]);
        }

    }



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] a;
        a= new String[]{"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen", "Jeremy Goodwin"};
        System.out.println("There are 5 employees: ");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        System.out.print("Enter an employee name to remove:");
        String y=in.nextLine();
        System.out.println("There are 4 employees:");
        remover(a,y);


    }
}
