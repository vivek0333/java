package collection;
// 8) remove all element
import java.util.LinkedList;

public class removeHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList();
		l.add(201);
		l.add(301);
		l.add(401);
		l.add(501);
		l.add(601);
		System.out.println(l);
		l.removeAll(l);
		System.out.println(l);
	}

}
