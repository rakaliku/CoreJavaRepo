package com.java.conceptjavaclass;

public class RertunTypeOfMethod1 {

	int t = 587;
	int j = 693;

	int sumMethod(int t, int j) {
		/*this.t = t;
		this.j = j;*/
		System.out.println(t);
		
		int sum = this.t + this.j;
		
		System.out.println(this.t) ;
		System.out.println(this.j);
		
		System.out.println(sum);
		return 2;
	}

	public static void main(String[] args) {
		new RertunTypeOfMethod1().sumMethod(1000, 741);
	}
}
