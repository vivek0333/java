package controlstatement;

import java.util.Scanner;

public class maxmin {

	public static void main(String[] args) {
int a,b;
Scanner src =new Scanner (System.in);
System.out.println("enter the value a");
a=src.nextInt();
System.out.println("enter the value b");
b=src.nextInt();
if(a>b)
{
	System.out.println("a is maximum ");

}
else if (b>a )
{
	System.out.println("b is maximum");
}
	}

}
