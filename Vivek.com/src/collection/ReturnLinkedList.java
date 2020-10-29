package collection;
//11)	Write a program to iterate a linked list in reverse order.

import java.util.Collections;
import java.util.LinkedList;

public class ReturnLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> l = new LinkedList();
l.add(201);
l.add(301);
l.add(401);
l.add(501);
l.add(601);
System.out.println(l);
Collections.reverse(l);
System.out.println("reverse list is : "+l);
	}

}
