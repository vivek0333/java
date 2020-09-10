package Abstractioninterfaces;



public class Authormain {


	private static String authorname;
	private static String place;
	private static int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub




Author obj=new Author(authorname , place, age);
obj.setAuthorname("vivek");
obj.setAge(23);
obj.setPlace("pune");
System.out.println("enter the author name:"+obj.getAuthorname());
System.out.println("enter the age of author:"+obj.getAge());
System.out.println("enter the place:"+obj.getPlace());

	}

}
