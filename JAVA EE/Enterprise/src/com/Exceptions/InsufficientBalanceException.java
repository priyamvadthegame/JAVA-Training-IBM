package com.Exceptions;

import javax.naming.InsufficientResourcesException;

public class InsufficientBalanceException extends RuntimeException
{   private String message;
	public InsufficientBalanceException() {
	// TODO Auto-generated constructor stub
		this.message="";
	}
	public InsufficientBalanceException(String message)
	{
		this.message=message;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Not enough Balance to withdraw"+message;
		}
}
