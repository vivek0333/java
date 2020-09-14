package methods;

import java.util.Scanner;

public class Addition {
int num1,num2,result;
Scanner src=new Scanner (System.in);
void addition()
{
	System.out.println("enter the value of num 1");
	num1=src.nextInt();
	System.out.println("enter the value of num 2");
	num2=src.nextInt();
	result=num1+num2;
	System.out.println("the result is:"+result);
	
}
void multplication()
{
	System.out.println("enter the value of num 1");
	num1=src.nextInt();
	System.out.println("enter the value of num 2");
	num2=src.nextInt();
	result=num1*num2;
	System.out.println("the result is:"+result);
}
void substraction()
{
	System.out.println("enter the value of num 1");
	num1=src.nextInt();
	System.out.println("enter the value of num 2");
	num2=src.nextInt();
	result=num1-num2;
	System.out.println("the result is:"+result);
}
}
