package String;

import java.util.Scanner;

public class example1 {
	
void method1()
{
	Scanner src = new Scanner (System.in);
	System.out.println("enter the string name");
	String s1 =src.next();
	System.out.println("enter the char");
	char character = src.next().charAt(0);
	System.out.println("string s1:"+s1);
	int counter = 0;
	char ch[]= s1.toCharArray();
	for (int i=0;i<ch.length;i++)
	{
		if (character==ch[i] )
		{
			counter ++;
		}
	}
	System.out.println("character "+character+" in string :" +s1+ " is present at " +counter+ " times ");
}
}
