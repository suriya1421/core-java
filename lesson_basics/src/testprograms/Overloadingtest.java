package testprograms;

import java.security.DomainCombiner;

public class Overloadingtest {
	int a=10;
	int b=5;
	int c;

	
	public void add() {
		c=a+b;
		System.out.println(c);
		}
	public int add(int a,int b) {
		c=a+b;
		System.out.println(c);
		return c;
	}
	public int add(int a,int b,int d) {
		c=a+b+d;
		System.out.println(c);
		return c;
	}

public static void main(String[] args) {
	Overloadingtest ot=new Overloadingtest();
	ot.add();
	ot.add(10, 20);
	ot.add(10, 20, 10);
}
}
