package Array;

import java.util.Scanner;

public class evenodd {
void inputs()
{
	Scanner src = new Scanner (System.in);
	int size;
	System.out.println("ente size");
	size=src.nextInt();
	int array[]=new int [size];
	System.out.println("enter the element");
	for(int i=0;i<array.length;i++)
	{
		array[i]=src.nextInt();
	}
	evenodd(array);
}
void evenodd(int array[])
{
	for(int i=0;i<array.length;i++)
	{
		if(array[i]%2==0)
		{
			System.out.println(array[i]+ "this element is even" );
		}
		else
		{
			System.out.println(array[i]+ "this element is odd" );
		}
	}
	display(array);
}
void display(int array[])
{
	for(int i:array)
	{
		System.out.println("elements are" +i);
	}
}
}
