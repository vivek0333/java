package Array;

import java.util.Scanner;

public class indexfinding {
	  void method()
	  {
		  Scanner src =new Scanner (System.in);
		  int size,element;
		  System.out.println("enter size");
		  size=src.nextInt();
		  int array[]=new int [size];
		  System.out.println("enter the element");
		   for (int i=0;i<array.length;i++)
		   {
			   array[i]=src.nextInt();
		   }
		   System.out.println("enter the element which index to be find");
		   element=src.nextInt();
		   for (int i=0;i<array.length;i++)
		   {
			   if (array[i]==element)
				   System.out.println("index of given element is: "+i);
		   }
	  }

}
