package collection;

import java.util.HashSet;

public class testEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		System.out.println("original hashset "+h);
		System.out.println("set is empty? "+h.isEmpty());
	}

}
