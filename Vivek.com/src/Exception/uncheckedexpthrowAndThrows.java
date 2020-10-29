package Exception;

import java.util.Scanner;

public class uncheckedexpthrowAndThrows {
void vvk() throws ArithmeticException
{
	Scanner src = new Scanner (System.in);
	System.out.println("enter the num 1");
	int num1=src.nextInt();
	System.out.println("enter the num 2");
	int num2=src.nextInt();
	int result=0;
	try
	{
	 result=num1/num2;
	throw new ArithmeticException();
	}
	catch(ArithmeticException e)
	{
		
		System.out.println("result is "+result);
		System.out.println("Exception handled");
	}
}
void vvk1() throws ArithmeticException
{
	 vvk();
	 System.out.println("vvk executed");
}
void vvk2() throws ArithmeticException
{
	vvk1();
	System.out.println("1 is executed");
}
}
