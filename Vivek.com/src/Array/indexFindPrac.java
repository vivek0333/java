package Array;

import java.util.Scanner;

public class indexFindPrac {
void inp ()
{
Scanner src = new Scanner (System.in);
System.out.println("enter the size");
int size =src.nextInt();
int array[] = new int [size];
System.out.println("enter element");
for(int i=0;i<array.length;i++)
{
	array[i] = src.nextInt();
}
		System.out.println("enter element to be find");
		int element = src.nextInt();
		for (int i=0;i<array.length;i++)
		{
			if(array[i]==element)
				System.out.println("index of given element is: "+i);
		}
	
}
}
