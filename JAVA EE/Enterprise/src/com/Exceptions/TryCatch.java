package com.Exceptions;
 class BankAccount
{
	int balance;
	public BankAccount(int balance) {
		// TODO Auto-generated constructor stub
		this.balance=balance;
	}
	public int withdraw(int withdrawAmount)throws InsufficientBalanceException
	{	if(withdrawAmount>balance)
		{
			throw new InsufficientBalanceException();
		}
		else
		{
			this.balance=balance-withdrawAmount;
		}
		return balance;
	}
}
 class TryCatch {
    
	public static void main(String[] args) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount(5000);
		try
		{
			System.out.println(b.withdraw(5001));
		}
		catch(InsufficientBalanceException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(b.withdraw(500));
	}

}
