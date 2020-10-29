package collection;
// 20)	Write a program to remove first and last element from a linked list.
import java.util.LinkedList;

public class removeFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> list=new LinkedList<String>();

	      //Adding elements to the Linked list
	      list.add("Steve");
	      list.add("Carl");
	      list.add("Raj");
	      list.add("Negan");
	      list.add("Rick");

	      //Removing First element
	      //Same as list.remove(0);
	      list.removeFirst();

	      //Removing Last element
	      list.removeLast();
	      System.out.println(list);
	}

}
