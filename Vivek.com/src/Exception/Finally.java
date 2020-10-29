package Exception;

import java.util.Scanner;

public class Finally {
void useoffinally()
{
	Scanner src = new Scanner (System.in);
	System.out.println("enter the num1");
	int num1 =src.nextInt();
	System.out.println("enter the va;e of num2");
	int num2=src.nextInt();
	int result = 0;
	try
	{
	result =num1/num2;
	}
	catch(ArithmeticException e)
	{
		System.out.println("excrption handled");
	}

	finally
	{
		System.out.println("handled by finally");
	}
	System.out.println("the result is:"+result);
}
}
