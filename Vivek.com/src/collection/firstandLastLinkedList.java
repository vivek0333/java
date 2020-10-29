package collection;
//12)	Write a program to insert elements into the linked list at the first and lastposition.

import java.util.LinkedList;

public class firstandLastLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList();
		l.add(201);
		l.add(301);
		l.add(401);
		l.add(501);
		l.add(601);
		System.out.println(l);
		l.addFirst(101);
		l.addLast(701);
		System.out.println(l);
	}

}
