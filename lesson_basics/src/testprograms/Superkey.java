package testprograms;

public class Superkey extends Thiskey {
      int a=5;
	public  void add() {
		int b=5;
		int c = super.a+b;
		System.out.println(c);
		
	}
	public static void main(String args[]) {
		 Superkey sk=new Superkey();
		sk.add();
	}

}
