//7)	Write a program to shuffle elements in a array list.
package collection;

import java.util.ArrayList;
import java.util.Collections;

public class shufleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c = new ArrayList();
		c.add("satyam");
		c.add("shivam");
		c.add("sundra");
		c.add("vivek");
		System.out.println(c);
		Collections.shuffle(c);
		System.out.println("shuffled list is :"+c);
	}

}
