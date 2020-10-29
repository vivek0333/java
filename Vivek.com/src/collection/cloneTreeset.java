package collection;
//14] clone treeset..
import java.util.Collections;
import java.util.TreeSet;

public class cloneTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet  l = new TreeSet();
		l.add("red");
		l.add("orange");
		l.add("white");
		l.add("green");
		l.add("blue");
		System.out.println(l);
		
	
		TreeSet l2 = new TreeSet();
		l2=(TreeSet)l.clone();
		System.out.println("cloned treeset is"+l2);
		
	}

}
