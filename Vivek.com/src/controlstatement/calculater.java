package controlstatement;

import java.util.Scanner;

public class calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner src =new Scanner (System.in);
int a,b,c;
System.out.println("enter the value of a");
a=src.nextInt();
System.out.println("enter the value of b");
b=src.nextInt();
c=a+b;
{
System.out.println("value of a+b:"+c);
}
c=a-b;
{
System.out.println("value of a-b:"+c);
}
c=a*b;
{
System.out.println("value of a*b:"+c);
}

	}

}
