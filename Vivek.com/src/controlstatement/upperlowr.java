package controlstatement;

import java.util.Scanner;

public class upperlowr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch;
Scanner src=new Scanner (System.in);
System.out.println("enter any chartr");
ch=src.nextLine().charAt(0);
if(ch>='A'&& ch<='Z')
{
	System.out.println("chractr is upper case");
}
else {
	System.out.println("char is lower case");
}
	}

}
