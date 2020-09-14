package controlstatement;

import java.util.Scanner;

public class posinegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner src = new Scanner(System.in);
int num;
System.out.println("enter the number");
num=src.nextInt();
if(num>0)
{
	System.out.println("number is poitive");
	
}
 else if(num<0)
{
	System.out.println("number is negative");
}
else
{
	System.out.println("number is zero");
}

	}

}
