package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeSetDemo {
	public static void demoA ()
    {
    TreeSet<String> ts=new TreeSet<String>();
    ts.add("Cut");
    ts.add("Ivan");
    ts.add("Assam");
    ts.add("Ball");
    ts.add("dog");
    ts.add("Aag");
    ts.add("Ag");
    ts.add("Event");
    ts.add("Fan");
    //ts.add(null);
    ts.add("Delhi"); 
    ts.add("carrot");
    ts.add("Ball");
    ts.add("apple");
    ts.add("boy");
    ts.add("ogg");
    ts.add("Fool");
    //System.out.println(s);
    System.out.println("Size "+ts.size());
    Iterator<String> itr = ts.iterator ();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    }

}
	public static void main(String[] args) {
		demoA();
		
	}
	}