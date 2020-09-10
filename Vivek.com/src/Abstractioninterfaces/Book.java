package Abstractioninterfaces;

public class Book {
	String Author,name;
	int price;
	Book (String Author,String name,int price)
	{
		this.Author=Author;
		this.name=name;
		this.price=price;
	}
	public String getAuthor() {
		return Author;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

}
