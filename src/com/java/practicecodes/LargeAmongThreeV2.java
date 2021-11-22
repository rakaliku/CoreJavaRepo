package com.java.practicecodes;

public class LargeAmongThreeV2 {
    public static void main(String[] args)
    {
        int a = 10, b=56, c=78;
        //Nested if logic
        if (a>b)
        {
            if (a>c)
            {
                System.out.println("A is greater....");
            }
        }
        else if (b>c)
        {
            System.out.println("B is greater..");
        }
        else
        {
            System.out.println("C is greater....");
        }
    }
}
