package com.java.scannerclass;
import java.util.*;
public class ScannerClassLearning {
	
        public static void main()
        {
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("please enter the value of");
        	int a =scanner.nextInt();
        //	bolean b=scanner.equals(args);
        	System.out.println("a="+ a);
        	//System.out.println(b);
        	scanner.close();
        }
}
