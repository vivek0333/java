package Basic;

public class Convertdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int days=373;
int years=days/365;
int week=years%7;
int day=week%7;
System.out.println("the yearsis :"+years);
System.out.println("the week :"+week);
System.out.println("the day:"+day);

	}

}
