package Array;

import java.util.Arrays;

public class removeArray {
	void Aremove()
	{
		int array[]= {25,20,30,40};
		System.out.println("original array is:"+Arrays.toString(array));
		int removeindex=1;
		for(int i=removeindex;i<array.length-1;i++)
		{
			array[i]=array[i+1];
		}
		System.out.println("after removing the "+ ""+ "second element:" +Arrays.toString(array));
	}

}
