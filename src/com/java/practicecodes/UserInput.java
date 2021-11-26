package com.java.practicecodes;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name----");
        String my_name = s.next();
        System.out.println("my name is - "+my_name);
        System.out.println("enter your gender...");
        char gender = s.next().charAt(0);
        System.out.println("gander->"+gender);



    }
}
