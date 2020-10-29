package Exception;

import java.util.Scanner;

public class runtimestack2 {

	void methods1()
	{
		int result =0;
		Scanner src = new Scanner (System.in);
		System.out.println("enter the num 1");
		int num1=src.nextInt();
		System.out.println("enter the num2");
		int num2=src.nextInt();
		try
		{
		 result=0;
		result=num1/num2;
	
		}
		catch (ArithmeticException e)
		{
			
			System.out.println("exception is handled");
		}
		
		System.out.println("result is "+result);
}
	void methods2()
	{
		methods1();
	}
	void methods3()
	{
		methods2();
	}
	void methods4()
	{
		methods3();
	}
}
