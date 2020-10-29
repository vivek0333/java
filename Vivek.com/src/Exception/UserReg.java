package Exception;

import java.util.Scanner;

public class UserReg {
String country ,username;
int age;
Scanner src = new Scanner (System.in);
void registrationprofile() throws InvalidCountryNameException,  InvalidAgeException
{
	System.out.println("enter the user name");
	username=src.next();
	System.out.println("enter the country name");
	country=src.next();
	System.out.println("enter the age");
	age=src.nextInt();
	
	if (country.equalsIgnoreCase("india")==false)
	{
		throw new  InvalidCountryNameException ("invalid country");
	}
	else {
		System.out.println("user belongs to india!! .belongs.cheers**");
	}
	try {
	if (age<18)
	{
		throw new InvalidAgeException("Invalid age");
		
	}
	else {
		System.out.println("age is valid ");
	}
	}
	catch (InvalidAgeException e)
	{
		System.out.println("user is minor");
	}
}
}
