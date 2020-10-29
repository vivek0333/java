package collection;
//15)	Write a program to insert some elements at the specified position into a linked list

import java.util.LinkedList;

public class insertelementLInked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList();
		l.add(201);
		l.add(301);
		l.add(401);
		l.add(501);
		l.add(601);
		System.out.println(l);
		l.add(0, 101);
		l.add(5, 707);
		l.add(6, 801);
		l.add(3, 333);
		System.out.println("new list is :"+l);
	}

}
