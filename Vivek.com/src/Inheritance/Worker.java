package Inheritance;

import java.util.Scanner;

public class Worker {
String sname,saddress;
int sage,sphonenumber,ssalary,da,hra;
	Scanner src = new Scanner(System.in);

	
void displaysalary()
{
	
	System.out.println("enter the name of employee");
	sname =src.next();
	System.out.println("enter the address of employee");
	saddress =src.next();
	System.out.println("enter the age of employee");
	sage = src.nextInt();
	System.out.println("enter the ph num of employee ");
	sphonenumber=src.nextInt();
	System.out.println("enter the da ");
	da=src.nextInt();
	System.out.println("enter hra of employee");
	hra=src.nextInt();
	ssalary=da*hra;
	System.out.println("the salary is "+ssalary);
	
}
}























