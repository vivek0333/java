package collection;
// 10() iterate through all element
import java.util.Iterator;
import java.util.TreeSet;

public class itreteTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet t = new TreeSet();
t.add("vivi");
t.add("vivek");
t.add("King");
t.add("yellow");
System.out.println(t);
Iterator i = t.iterator() ;
while(i.hasNext())
{
	System.out.println(i.next());
}

	}

}
