package com.chainsys.introduction;

public class Fourth {

	// TODO Auto-generated method stub
	public static void taskA() {
		System.out.println("enter your name");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String name = sc.next();
		System.out.println("your name is");
		System.out.println(name);
	

	}

	public static void taskB() {
		System.out.println("enter number");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int number = sc.nextInt();
		int result = number;
		System.out.println("the number is");
		System.out.println(result);
		sc.close();

	}

	public static void main(String[] args) {
		taskA();
		taskB();

	}
}