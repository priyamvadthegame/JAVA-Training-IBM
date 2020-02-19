package com.Annotation;
enum Status
{
	NEW(0), REJECTED(1), ACCEPTED(2),COMPLETED(3);
	int val;
	Status(int val)
	{
		this.val=val;
	}
	public int getValue()
	{
		return this.val;
	}
	public void setValue(int val)
	{
		this.val=val;
	}
}
class Order
{
	private int id,quantity;
	private String name;
	private Status status;
	public Order(String name,int id,int quantity,Status status)
	{
		this.name=name;
		this.id=id;
		this.quantity=quantity;
		this.status=status;
	}
	public int getOrderStatus()
	{
		return status.getValue();
	}
}

class StatusEnumMain
{
	public static void main(String args[])
	{
		Order o=new Order("Call of duty Ghost",2,2,Status.REJECTED);
		System.out.println(o.getOrderStatus());
	}
}
		