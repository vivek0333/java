package Exception;

import java.util.Scanner;

public class uncheckedcalling {
	int num1,num2,result;
	void unc()
	{
		Scanner src = new Scanner (System.in);
		System.out.println("enter the num 1");
		num1=src.nextInt();
		System.out.println("enterthe num2");
		num2= src.nextInt();
		try
		{
	
		result=num1/num2;
		System.out.println("results is "+result);
		}
		catch (ArithmeticException e)
		{
		
			System.out.println("exceptin is handled");
		}
		System.out.println("results is "+result);
	}
void unc1()
{
	unc();
	System.out.println("print method unc1");
}
void unc2()
{
	unc1();
	System.out.println("print method unc2");
}
void unc3()
{
	unc2();
	System.out.println("print method unc3");
}
}
