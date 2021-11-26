package com.java.practicecodes;

public class SwapNumberLogicWithoutThirdVar {
    public static void main(String[] args)
    {
       int a =50,b=17;
       a = a + b;
       b = a - b;
       a = a-b;
       System.out.println("a-"+a);
       System.out.println("b-"+b);
    }
}
