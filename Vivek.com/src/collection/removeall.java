package collection;
//21)	Write a program to remove all the elements from a linked list.
import java.util.LinkedList;

public class removeall {
	public static void main(String[] args) {
		 LinkedList<String> list=new LinkedList<String>();

	      //Adding elements to the Linked list
	      list.add("Steve");
	      list.add("Carl");
	      list.add("Raj");
	      list.add("Negan");
	      list.add("Rick");
	      System.out.println(list);
	      
	      list.removeAll(list);
	      System.out.println("remove all "+list);
}
}