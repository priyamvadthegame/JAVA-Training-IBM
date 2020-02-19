package com.JavaBasics;
class Account11
{
  private int id;
  private String name;
  private double startBalance;
  public Account11(int id,String name,double startBalance)
  {
	this.id=id;
	this.name=name;
	this.startBalance=startBalance;
  }
  public double getBalance()
  {
	return this.startBalance;
  }
}

class SavingsAccount extends Account11
{
	double fixedDepositAmmount;
	public SavingsAccount(int id,String name,double startBalance,double fixedDepositAmmount)
	{
		super(id,name,startBalance);
		this.fixedDepositAmmount=fixedDepositAmmount;
	}
	public double getBalance()
	{
		return super.getBalance()+this.fixedDepositAmmount;
	}
}
class CurrentAccount extends Account11
{
	double cashCredit;
	public CurrentAccount(int id,String name,double salary,double cashCredit)
	{
		super(id,name,salary);
		this.cashCredit=cashCredit;
	}
	public double getBalance()
	{
		return super.getBalance()+this.cashCredit;
	}
}
class AccountMain1
{	public static double calculateTotalAmountInBank(Account11 e[])
	{	double totalBalance=0;
		for(int i=0;i<e.length;i++)
		{
			totalBalance+=e[i].getBalance();
		}
		return totalBalance;
			
	}
	public static void main(String args[])
	{
		Account11 e[]=new Account11[4];
		e[0]=new SavingsAccount(50,"Hemant",300000.0,300.0);
		e[1]=new SavingsAccount(50,"Raj",40000.0,2000.0);
		e[2]=new CurrentAccount(50,"Priyamvad",1000.0,100.0);
		e[3]=new CurrentAccount(50,"Singh",1000.0,50.0);
		System.out.println(calculateTotalAmountInBank(e));
	}
}
		