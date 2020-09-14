package controlstatement;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner src = new Scanner (System.in);
int num ;
System.out.println("enter the num");
num=src.nextInt();
if (num % 2==0)
{
	System.out.println("the num is even");
}
else {
	System.out.println("the num is odd");
}
	}

}
