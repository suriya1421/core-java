package com.chainsys.introduction;

public class Return_type {

	public void add() {
		int a = 5;
		int b = 10;
		int c = a + b;
	System.out.println(c);
	}

	public int add1() {
		int a = 5;
		int b = 6;
		int result = a + b;
		System.out.println(result);
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Return_type s = new Return_type();
		 int v=s.add1();
		
		System.out.println(v);
	}

}
