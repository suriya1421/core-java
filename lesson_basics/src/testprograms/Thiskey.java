package testprograms;

public class Thiskey {
	int a=10;
	int b=10;
	public  void add() {
		int a=5;
		int c = this.a+b;
		System.out.println(c);
		
	}
	public static void main(String args[]) {
		Thiskey tk=new Thiskey();
		tk.add();
	}

}
