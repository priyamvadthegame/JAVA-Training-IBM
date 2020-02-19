package com.JavaBasics;
class Account
{
 private int balance;
 private String name;
 private int accountNo;
 public Account(int balance,String name,int accountNo)
 {
	 this.balance=balance;
	 this.name=name;
	 this.accountNo=accountNo;
 }
 public void setName(String name)
 {
	 this.name=name;
 }
 public void setBalance(int balance)
 {
	 this.balance=balance;
 }
 public String getName()
 {
	 return this.name;
 }
 public int getBalance()
 {
	 return this.balance;
 }
 public int getAccountNo()
 {
	 return this.accountNo;
 }
 public int withdraw(int withdrawAmount)
 {    
	 this.balance=this.balance-withdrawAmount;
	 if(balance<0)
	 {
		 this.balance=this.balance+withdrawAmount;
		 return 0;
	 }
	 else
	 {
		return this.balance;
	 }
 }
 public int deposit(int depositAmount)
 {   
	 this.balance=this.balance+depositAmount;
	 return this.balance;
 }
 public String toString()
 {
	 return "\n"+this.accountNo+" :\n"+"Name : "+this.name+"\n"+"Balance : "+this.balance+"\n";
 }
}
class AccountMain
{
	public static void main(String args[])
	{
		Account account=new Account(500000,"GunMunSingh",5050);
		System.out.println(account);
		System.out.println("After depositing 50000");
		account.deposit(50000);
		System.out.println(account);
		System.out.println("After withdrawing 5000000");
		if(account.withdraw(50000000)!=0)
		System.out.println(account);
		else
		{
			System.out.println("Not Enough Balance to withdraw Balance is :"+account.getBalance());	
		}
		
	}
}
		
		
 