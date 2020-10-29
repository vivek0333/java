//8)	Write a program to sort a given array list
package collection;

import java.util.ArrayList;
import java.util.Collections;

public class sortlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c = new ArrayList();
		c.add("e");
		c.add("a");
		c.add("d");
		c.add("b");
		c.add("c");
		
		System.out.println(c);
		Collections.sort(c);
		System.out.println("sorted list is: "+c);
	}

}
