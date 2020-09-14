package Inheritance;

import java.util.Scanner;

public class vehical {
String vname,station;
int price,modelnum;
Scanner src=new Scanner (System.in);
public  vehical()

{
	
}
public void displaym()
{
	System.out.println("enter the name of vehical");
	vname =src.next();
	System.out.println("enter the modelnum of vehile");
	modelnum=src.nextInt();
	System.out.println("enter the price of vehile");
	price=src.nextInt();
	System.out.println("enter the sstatin of vehile");
	station=src.next();
}











}

