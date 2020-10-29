package collection;
//* iterate through element
import java.util.PriorityQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IteateQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue p = new PriorityQueue();

		p.add(10);
		p.add(20);
		p.add(30);

		System.out.println(p);
		
		Iterator value = (Iterator) p.iterator();
		
		while (value.next())
	{
		System.out.(value.next());
	}
	}

}