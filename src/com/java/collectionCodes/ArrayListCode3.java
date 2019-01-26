package com.java.collectionCodes;
import java.util.ArrayList;

public class ArrayListCode3 {
			public static void main(String args[])
			{
			Emp e=new Emp(111,"rakesh");
			//Student s=new Student(555,"rinky");
			ArrayList<Emp> ai=new ArrayList<Emp>();
			ai.add(e);
			//ai.add(s);
			System.out.println(ai);
			
			}
}
