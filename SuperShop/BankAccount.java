package SuperShop;
import Product.*;
import Person.*;
import Interfaces.*; 
 
 
 
 public class BankAccount implements BankAccountOperation

{
	String accountNo;
	String accountHolderName;
	double balance;
	
	public BankAccount()
	{
	}
	
	public BankAccount(String accountNo,String accountHolderName,double balance)
	{
		this.accountNo=accountNo;
		this.balance=balance;
		this.accountHolderName=accountHolderName;
	}
	public void setAccountNo(String accountNo)
	{
		this.accountNo=accountNo;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void setAccounHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public String getAccountNo()
	{
		return accountNo;
	}
	public double getbalance()
	{
		return balance;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void deposite(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
		}
		else
		{
			System.out.println("You are not allowed to Input Negative");
		}
	}
	
	public void withdraw(double amount)
	{		
		if(amount>0 && amount<=balance)
		{
			balance-=amount;			
		}
		else
		{
			System.out.println("Not Enough amount/Negative amount Input");
		}
	}
	
	public void payment(double amount,BankAccount obj)
	{
		if(amount<balance)
		{
			balance-=amount;
			obj.balance=obj.balance+amount;
			System.out.println("Successsfully payment Done "+amount+" Taka");
		}
		else
		{
			System.out.println("transfer not possible");
		}
	}
	public void show()
	{
		System.out.println("Account Number: "+accountNo);
		System.out.println("Balance: "+balance);
		System.out.println("Account Holder: "+accountHolderName);
	}
}

	
	