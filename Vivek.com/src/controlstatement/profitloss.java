package controlstatement;

import java.util.Scanner;

public class profitloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner src=new Scanner (System.in);
int sellprice,costprice;
System.out.println("enter the selling price");
sellprice=src.nextInt();
System.out.println("enter the cost price");
costprice=src.nextInt();
if (sellprice>costprice)
{
	System.out.println("profitable");
}
else {
	System.out.println("loss");
}
	}

}
