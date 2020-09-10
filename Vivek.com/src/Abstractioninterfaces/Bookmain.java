package Abstractioninterfaces;

public class Bookmain {

	

	public static void main(String[] args) {
String author="vishal";
String name = "kk";
int price = 2000;
Book obj =new Book( author,  name,  price);

obj.getAuthor();
obj.getName();
obj.getPrice();
System.out.println("enter the author name:"+obj.getAuthor());
System.out.println("enter the name:"+obj.getName());
System.out.println("enter the price:"+obj.getPrice());


	}

}
