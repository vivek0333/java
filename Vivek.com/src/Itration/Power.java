package Itration;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,power,result=1,i;
Scanner src=new Scanner (System.in);

System.out.println("enter the num");
num=src.nextInt();
System.out.println("enter the power");
power=src.nextInt();
for (i=1;i<=power;i++)
{
	result=result*num;
}
System.out.println("the result is:"+result);
	}

}
