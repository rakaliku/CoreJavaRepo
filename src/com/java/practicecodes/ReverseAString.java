package com.java.practicecodes;
import java.lang.String;

public class ReverseAString {
    public static void main(String[] args)
    {
        String str = "likun";
        System.out.println(str.length());
        String rev = "";
        for (int  i= str.length() -1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("reverse odf the string is -"+rev);
    }
}
