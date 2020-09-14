package Inheritance;

import java.util.Scanner;

public class Triangle {
int side1,side2,side3,area;
Scanner src=new Scanner (System.in);
public Triangle()
{
	
}
void area()
{
	System.out.println("enter side1");
	side1=src.nextInt();
	System.out.println("enter side2");
	side2=src.nextInt();
	System.out.println("enter side3");
	side3=src.nextInt();
	area=side1*side2*side3;
	System.out.println("area of triangle is"+area);
}
}
