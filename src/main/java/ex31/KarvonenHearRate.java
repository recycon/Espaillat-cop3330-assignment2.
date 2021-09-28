package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mario Espaillat
 */
import java.util.Scanner;

public class KarvonenHearRate {
    public static void KHR(int age,int restingHR){
        double intensity;
        double TargetHeartRate;
        System.out.println("Intensity |  Rate");
        System.out.println("-----------------------");

        for(double i=0.55;i<.96;i+=0.05){
            TargetHeartRate = (((220 - age) - restingHR) * i) + restingHR;
            intensity=i*100;
            int ints=(int) intensity;
            TargetHeartRate=Math.round(TargetHeartRate);
            int y=(int)TargetHeartRate;
            System.out.println(ints+"%       |  "+y+" bpm");
        }
    }
    public static int valid(String a){
        try
        {
            Integer.parseInt(a);
            return 1;
        }
        catch (NumberFormatException e)
        {
            System.out.println("Please enter a valid input");
        }
        return 0;

    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String age,rs;
        System.out.print("Resting Pulse: ");
        rs= in.next();
        System.out.print("Age: ");
        age= in.next();
        if(valid(age)==1 && valid(rs)==1) {
            int a=Integer.parseInt(age);
            int b=Integer.parseInt(rs);
            KHR(a, b);
        }


    }



}
