package Exception;
//ques 2

import java.util.Scanner;

public class RuntimestackHandle {
	void method1()
	{
	Scanner src = new Scanner(System.in);
	
	System.out.println("enter the value num 1");
	
	int num1=src.nextInt();
	System.out.println("enter value of num 2");
	int num2=src.nextInt();
	int result=0;
	try
	{
	result=num1/num2;
	}
	catch(ArithmeticException e)
	{
		System.out.println("exception is handled");
	}
	System.out.println("the result is:"+result);
	
}
	void method2()
	{
		method1();
	}
	void method3()
	{
		method2();
	}
	void method4()
	{
		method3();
	}
}
