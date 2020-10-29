package collection;

//(13) get first and last element in treeset

import java.util.TreeSet;

public class firstandLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet l = new TreeSet();
		l.add("red");
		l.add("orange");
		l.add("white");
		l.add("green");
		l.add("blue");
		System.out.println(l);
		System.out.println(l.first());
		System.out.println(l.last());
	}

}
