package com.bridglabz.PracticeProblemDay1;
import java.util.Scanner;
public class PracticeProblem {
    public static void main(String[] args) {
        message1();
    }
    public static void message1(){
        System.out.println("Enter the message:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
    }
}
