package com.java.practicecodes;

public class LeapYearCheck {
    public static void main (String[] args)
    {
        int yr = 2001;
        if (yr % 400 == 0)
        {
            if (yr % 100 == 0)
            {
                System.out.println("Year is leap year...");
            }
        }
        else if (yr % 4== 0)
        {
           System.out.println("Year is a leap year...");
        }
        else
        {
            System.out.println("Year is not leap year");
        }
    }
}
