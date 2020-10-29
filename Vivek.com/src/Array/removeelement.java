//not well understand
package Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class removeelement {
	void meth()
	{
Scanner src = new Scanner (System.in);
		int size,element;
		System.out.println("enter size");
		size=src.nextInt();
		int array[]=new int [size];
		System.out.println("enter element");
		for(int i=0;i<array.length;i++)
		{
			array[i]=src.nextInt();
		}
		System.out.println("enter the element to be delated");
		int deleteelement=src.nextInt();
		
		
		if(deleteelement<=array.length+1)
		{
			System.out.println("deletion not possible");
		}
		else 
		{
			for(int i=deleteelement-1;i<array.length-1;i++)
			{
				array[i]=array[i+1];
			}
			System.out.println("after deleting element at location the array is"+deleteelement);
		}
		for(int i = 0;i<array.length-1;i++)
		{
			System.out.println("the array elements is"  +array[i]);
		}

		}
		}
	