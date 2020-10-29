package collection;

import java.util.ArrayList;

public class Updatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> b = new ArrayList();
b.add(10);
b.add(20);
b.add(30);
b.add(40);
System.out.println(b);
int elem= b.set(2, 15);
System.out.println("new list " +b);


	}

}
