package Inheritance;

import java.util.Scanner;

public class Rectangle extends Square{
	int length,breadth,area;
	Scanner src=new Scanner (System.in);
public Rectangle()
{
	
}
void area()
{
	System.out.println("enter the value of length");
	length=src.nextInt();
	
	System.out.println("enter the value of breadth");
	breadth=src.nextInt();
	area=length*breadth;
	System.out.println("area of Rectangle is"+area);
}
}
