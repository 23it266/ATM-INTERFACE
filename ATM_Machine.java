package Project;

import java.util.Scanner;

class ATM{
	float balance;
	int pin=2307;
	String trans = "";
	
	public void checkpin()
	{
		System.out.println("ENTER YOU PIN : ");
		Scanner sc = new Scanner(System.in);
		int enterpin=sc.nextInt();
		if(enterpin==pin)
		{
			menu();
		}
		else
		{
			System.out.println("ENTER A VALID PIN !!!");
		}
	}
	
	public void menu()
	{
		System.out.println("ENTER YOUR CHOICE : \n 1. CHECK ACCOUNT BALANCE \n 2. DEPOSIT MONEY \n 3. WITHDRAW MONEY \n 4. MINI STATEMENT \n 5. EXIT");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		if(opt==1)
		{
			checkbalance();
		}
		else if(opt==2)
		{
			deposit();
		}
		else if(opt==3)
		{
			withdraw();
		}
		else if(opt==4)
		{
			transhis();
		}
		else if(opt==5)
		{
			System.out.println("THANK YOU !!! PLEASE VISIT AGAIN ");
			return;
		}
		else
		{
			System.out.println("ENTER A VALID CHOICE !!! ");
		}
	}
	
	public void checkbalance()
	{
		System.out.println("YOUR BALANCE : "+ balance);
		menu();
	}
	
	public void deposit()
	{
		System.out.println("ENTER AMOUNT TO DEPOSIT : ");
		Scanner sc = new Scanner(System.in);
		float amount =sc.nextFloat();
		balance +=amount;
		System.out.println("MONEY DEPOSITED SUCESSFULLY !!!");
		System.out.println("CURRENT BALANCE : "+balance);
		String str = amount + " has been Credited\n" ;
		trans=trans.concat(str);
		menu();
	}
	
	public void withdraw()
	{
		System.out.println("ENTER AMOUNT TO WITHDRAW : ");
		Scanner sc = new Scanner(System.in);
		float amount=sc.nextFloat();
		if(amount>balance)
		{
			System.out.println("INSUFFICIENT BALANCE !!! ");
		}
		else
		{
			balance -=amount;
			System.out.println("MONEY WITHDRAWED SUCESSFULLY !!!");
			System.out.println("CURRENT BALANCE : "+balance);
			String str = amount + " has been Debited\n" ;
			trans=trans.concat(str);
		}
		menu();
	}

	public void transhis()
	{
		if(balance==0)
		{
			System.out.println("NO TRANSACTIONS OCCCURED !!!");
		}
		else
		{
			System.out.println("\n"+trans);
		}
		menu();
	}
}

public class ATM_Machine 
{
	public static void main(String args[])
	{
		ATM obj = new ATM();
		obj.checkpin();
	}
}