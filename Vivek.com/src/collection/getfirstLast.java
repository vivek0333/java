package collection;
//16)	Write a program to get the first and last occurrence of the specified elements ina	linked list

import java.util.LinkedList;

public class getfirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList();
		l.add(201);
		l.add(301);
		l.add(401);
		l.add(501);
		l.add(601);
		System.out.println(l);
		
		System.out.println("yhe index of 501 is : "+l.lastIndexOf(501));
	
	}

}
