package collection;

import java.util.ArrayList;
import java.util.Collections;

public class reverseelment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c = new ArrayList();
		c.add("e");
		c.add("a");
		c.add("d");
		c.add("b");
		c.add("c");
		System.out.println(c);
		Collections.reverse(c);
		System.out.println("reverse list is :"+c);
	}

}
