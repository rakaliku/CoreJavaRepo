//Program about List
package com.java.arrayexamples;

import java.util.*;

public class ArrayCode2 {
	//private static final String ArrayUtils = null;
	static String ar[] = { "ra", "jik" };
	static String ar2[] = { "liku", "ramesh" };

	
	public static String[] concatenate(String[] ar, String[] ar2)
	{
		List<String> list = new ArrayList<>();
		Collections.addAll(list, ar);
		Collections.addAll(list, ar2);

		return list.toArray(new String[0]);
	}
public static void main(String [] args)
{
	System.out.println(concatenate(ar,ar2));
	for (int i = 0;i>ar.length;i++)
	{
		System.out.println(ar[i]);
	}
	
}
}
