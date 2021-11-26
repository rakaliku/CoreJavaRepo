package com.java.practicecodes;

public class FactorialUsingRecursion {
    static int fact =1;
    public static void main(String[] args)
    {
        int no = 4;
//        int fact =1;
        FactorialUsingRecursion f = new FactorialUsingRecursion();
        f.callFact(no);
        System.out.println("factorial is ---"+fact);
    }
    void callFact(int no)
    {
        if (no>=1)
        {
            fact = fact * no;
            callFact(no-1);
//            return num ;
        }
    }
}
