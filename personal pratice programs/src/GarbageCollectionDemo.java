
public class GarbageCollectionDemo {
	 GarbageCollectionDemo gcd;
	public static void main(String args[] ){
		 GarbageCollectionDemo GCD1=new  GarbageCollectionDemo();
		 GarbageCollectionDemo GCD2=new  GarbageCollectionDemo();
		 GarbageCollectionDemo GCD3= new  GarbageCollectionDemo();
		 GCD1=null;
		 GCD1= GCD2;
		 System.out.println(GCD1);
		 System.out.println(GCD2);
		 System.out.println(GCD3);
		 System.gc();
	  
	    Runtime rt= Runtime.getRuntime();
	    System.out.println(rt.freeMemory());
	    System.out.println(rt.totalMemory());
		 rt.gc();
		 }

//	private void display() {
//		// TODO Auto-generated method stub
//		 GarbageCollectionDemo GCD4=new  GarbageCollectionDemo();
//		// GCD1=GCD4;
//		 
//	}
}

