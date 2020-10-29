package Array;

import java.util.Arrays;
import java.util.Scanner;

public class testEquality {
void equi()
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter size of array: ");
	int size= sc.nextInt();

	int array1[] = new int[size];

	System.out.println("Enter elements of array1: ");
	for(int i=0;i<array1.length;i++)
	{
		array1[i] = sc.nextInt();
	}
	
	
	System.out.println("Enter size1 of array2: ");
	int size2= sc.nextInt();

	int array2[] = new int[size2];

	System.out.println("Enter elements of array2: ");
	for(int i=0;i<array2.length;i++)
	{
		array2[i] = sc.nextInt();
	}
	test(array1,array2);

}

void test(int array1[],int array2[])
{
	
		if(Arrays.equals(array1, array2))System.out.println("same");
		else System.out.println("not same");
	}
}
