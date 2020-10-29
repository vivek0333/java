package String;

import java.util.Scanner;

public class Toggle {
	Scanner sc =new Scanner (System.in);
void method3()
{
	System.out.println("ENter a string: ");
	String s1 = sc.nextLine();

	char ch[] =s1.toCharArray();

	for(int i =0;i<ch.length;i++)
	{
		if((ch[i] <= 90) && (ch[i] >=65))
				{
			      ch[i] = (char) (ch[i]+32);
				}
		else 
		{
			ch[i] = (char) (ch[i] - 32);
		}
	}
	for(char v: ch)
		System.out.print(v);
}
}