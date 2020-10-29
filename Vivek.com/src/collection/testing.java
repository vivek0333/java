package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class testing {
	void arraylistdemo()
	{
		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add("vivek");
		a1.add("25000");
		System.out.println("arraylist1 is: "+a1);
		ArrayList a2 = new ArrayList();
		a2.add(1000);
		a2.add(2000);
		a2.add(3000);
		a2.add("king");
		a2.add("50000");
		System.out.println("arraylist2 is : "+a2);
		a1.addAll(a2);
		System.out.println("arraylist 1 is: "+a1);
		System.out.println("arraya1 size is: "+a1.size());
	//	a2.remove(1);
	//	System.out.println("arraylist 2 is"+a2);
		a1.set(3, "brand");
		System.out.println("array1 is: "+a1);
		System.out.println(a1.get(8));
		a1.retainAll(a2);
		System.out.println("retain: "+a1);
	}
	void linkedarrays()
	{
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add("vivi");
		l1.add(30);
		l1.add(40);
		System.out.println("list1is: "+l1);
		l1.addFirst(00);
		l1.addLast(000);
		System.out.println("list 1 is: "+l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println("remove first and last "+l1);
	l1.getFirst();
	l1.getLast();
	System.out.println(l1.getFirst());
	System.out.println(l1.getLast());
	
	}
	void vector()
	{
		Vector v = new Vector();
		v.add(1000);
		v.add(500);
		v.add(700);
		v.add(999);
		System.out.println("the vector is:"+v);
		v.addElement(333);
		System.out.println(""+v);
		v.removeElement(700);
		System.out.println("the vector is:" +v);
	}
	void stack ()
	{
		Stack s = new Stack ();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println("stsck is "+s);
		s.pop();
		System.out.println(s);
		s.push(100);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(100));
		
		
	}

}
