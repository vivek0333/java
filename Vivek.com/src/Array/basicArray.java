package Array;

import java.util.Scanner;

public class basicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner src=new Scanner (System.in);
System.out.println("enter the size of array");
int size=src.nextInt();
int array[]=new int [size];
System.out.println("enter the element ");
for(int i=0;i<array.length;i++)
{
	array[i]=src.nextInt();
}
     for (int i=0;i<array.length;i++)
	System.out.println("element of array is:"+array[i]);
     
	

	}

}
