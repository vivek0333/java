package Programme;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gs =new Scanner(System.in);

		System.out.println("enter the basic salary of employee");
		double bs = gs.nextDouble();
		if(bs <=10000)
		{
			double da =bs*80/100;
			double hra=bs*20/100;
			double gross =bs+da+hra;
			System.out.println("ross salary:"+gross);
			}
		else if(bs<=20000)
		{
			double da=bs*90/100;
			double hra=bs*30/100;
			double gross=bs+da+hra;
			System.out.println("gross salary is:"+gross);
			}
		else
		{
			double da=bs*90/100;
			double hra=bs*50/100;
			double gross= bs+hra+da;
			System.out.println("gross salary is:"+gross);

		}
	}

}
