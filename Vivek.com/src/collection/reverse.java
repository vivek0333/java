package collection;

import java.util.TreeSet;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet l = new TreeSet();
		l.add("red");
		l.add("orange");
		l.add("white");
		l.add("green");
		l.add("blue");
		System.out.println(l);
		l.descendingSet();
		System.out.println(l);
	}

}
