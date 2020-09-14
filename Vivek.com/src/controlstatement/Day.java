package controlstatement;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner (System.in);
int day;
System.out.println("enter the number of your choice");
day =src.nextInt();

if (day==1)
    {
	System.out.println("monday");
	}
else if (day==2)
{
	System.out.println("tuesday");
}

else if (day==3)
{
	System.out.println("wedensday");
}

else if (day==4)
{
	System.out.println("thursday");
	
}

else if(day==5)
{
	System.out.println("friday");
}
else if(day==6)
{
	System.out.println("saturday");
	
}

else if (day==7)
{
	System.out.println("Sundayyyyy!!!");
}

else {System.out.println("enter number between 1 to 7");}









	}

}
