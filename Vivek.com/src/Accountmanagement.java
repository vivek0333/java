import java.util.Scanner;

public class Accountmanagement
{
	Scanner sc = new Scanner (System.in);
	String name;
	int amount,accountnumber;
	
void insertdata()
{
	System.out.println("enter the name ");
	name=sc.next();
	
	System.out.println("enter account number");
	accountnumber=sc.nextInt();
	
}

void displaydata()
{
	System.out.println("cus name:"+name);
	System.out.println("acc numb"+accountnumber);
	System.out.println("balance is"+amount);
}
void depositamount()
{
	int depositamount;
	System.out.println("enter amount to be deposited");
	depositamount=sc.nextInt();
	
	amount=depositamount+amount;
	}
void withdraamount()
{
	int withdrawamount;
	System.out.println("enter amount to b withdrawn");
	withdrawamount=sc.nextInt();
	amount= amount-withdrawamount;
    }  

void accountbalance()
{
	System.out.println("balance is"+amount);
	
    }
}












