package com.java.practicecodes;

public class ReverseANumber {
    public static void main(String[] args)
    {
        int no = 12345;
        int rem,rev =0;
        while(no != 0)
        {
            rem = no%10;
            rev = rev *10 +rem;
            no = no/10;
        }
        System.out.println("reverse number is :-"+rev);
    }
}
