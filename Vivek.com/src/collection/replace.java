package collection;

import java.util.LinkedList;

//23)	Write a program to replace an element in a linked list.
public class replace {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList();
		l.add(201);
		l.add(301);
		l.add(401);
		l.add(501);
		l.add(601);
		System.out.println(l);
		l.set(3, 333)	;
		System.out.println(l);
		}

}
