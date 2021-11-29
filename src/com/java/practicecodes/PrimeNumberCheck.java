package com.java.practicecodes;

public class PrimeNumberCheck {
    public static void main(String[] args)
    {
        int num =27,temp=0;
        for (int i=2;i<= num-1;i++)
        {
            if (num%i ==0)
            {
                temp = temp+1;
            }

        }
        if (temp == 0)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("number is not prime");
        }
    }
}
