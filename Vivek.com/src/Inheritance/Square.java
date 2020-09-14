package Inheritance;

import java.util.Scanner;

public class Square {
int side;
Scanner src=new Scanner (System.in);

public Square()
{
	
   }

void area()
{
	int area;
	System.out.println("enter the value of side");
	side=src.nextInt();
	area=2*side*2*side;
	System.out.println("area of square is:"+area);
}
}
