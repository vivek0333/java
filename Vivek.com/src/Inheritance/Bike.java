package Inheritance;

import java.util.Scanner;

public class Bike extends vehical {
int discountrate;
Scanner src = new Scanner (System.in);
public Bike()
{
	
}
public void display()
{
	System.out.println("enter the bike name");
	vname=src.next();
	System.out.println("enter the bike model");
	modelnum= src.nextInt();
	System.out.println("enter the price of bike ");
	price=src.nextInt();
	System.out.println("enter the service station name");
	station=src.next();
	System.out.println("enter the discount rate");
	discountrate=src.nextInt();
}
	public void discount()
	{
		discountrate= price-((price/100)*5);
		System.out.println("discount on bike is:"+discountrate);
	}
	
}



