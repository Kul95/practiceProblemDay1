package com.bridglabz.PracticeProblemDay1;
import java.util.Scanner;
public class PracticeProblem {
    static int i;
    static char ch;
    static String str;
    static float f;
    static double d;
    static long l;
    static void  defaultValue(){
        System.out.println(i);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
    }
    public static void main(String[] args) {
        defaultValue();
        message1();
        equalsMethod();

    }
    public static void message1(){
        System.out.println("Enter the message:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
    }
public static void equalsMethod(){
        String str1="Kuldeep";
        String str2="Kuldeep";
    System.out.println(str1.equals(str2));
}
}
