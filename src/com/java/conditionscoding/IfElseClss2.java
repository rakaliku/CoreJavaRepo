package com.java.conditionscoding;

public class IfElseClss2 {

	public static void main(String[] args) {
            int a=8;
            int b=2;
            int c=90;
            
            if(a>b)
            {
            	if(a>c)
            		System.out.println("laregest no.="+a);
            	else
            		System.out.println("laregest no.="+c);
            }
            else
            {
            	if (b>a)
            		System.out.println("laregest no.="+b);
            	else
            		System.out.println("laregest no.="+c);
            }

	}

}
