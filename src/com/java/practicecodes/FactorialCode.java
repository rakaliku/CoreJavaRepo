package com.java.practicecodes;

public class FactorialCode {
        public static void main(String[] args)
        {
                int num = 5;
                int fact =1;
                for (int i = 1;i<=num;i++)
                {
//                        fact = num * (num-i);

                        fact = fact *i;
                        System.out.println(fact);
                }
                System.out.println(fact);
        }
}
