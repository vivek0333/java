package Abstractioninterfaces;

import java.util.Scanner;

public class Author {
	private String authorname,place;
	private int age;
	Scanner src=new Scanner(System.in);
	Author(String authorname ,String place ,int age)
	{
		this.authorname= authorname;
		this.place=place;
		this.age=age;
		
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	}


