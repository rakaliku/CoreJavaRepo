package com.java.practicecodes;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number....");
        int no1 = s.nextInt();
        System.out.println("enter second number .....");
        int no2 = s.nextInt();
        System.out.println("no1="+no1);
        System.out.println("no2="+no2);
        int res;
        System.out.println("enter symbol.....");
        String sym = s.next();
        switch (sym)
        {
            case "+":
                res = no1+no2;
                System.out.println("addition  is "+res);
                break;

            case "-":
                res = no1-no2;
                System.out.println("substraction is "+res);
                break;
            default:
                System.out.println("symbol is invalid...");
                break;
        }

    }
}
