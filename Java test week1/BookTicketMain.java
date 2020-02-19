class Ticket
{   String from,to;
	int seatNo;
	double price;
	public Ticket(String from,String to,int seatNo,double price)
	{
		this.from=from;
		this.to=to;
		this.seatNo=seatNo;
		this.price=price;
	}
	public double  getPrice()
	{
		return this.price;
	}
	
}

class BusTicket extends Ticket
{
	String from,to;
	int seatNo;
	double price;
	public BusTicket(String from,String to,int seatNo,double price)
	{
		super(from,to,seatNo,price);
	}
	public double getPrice()
	{
		return super.getPrice();
	}
}
class TrainTicket extends Ticket
{
	String from,to,seatType;
	int seatNo;
	double price;
	public TrainTicket(String from,String to,int seatNo,double price, String seatType)
	{
		super(from,to,seatNo,price);
		this.seatType=seatType;
	}
	public double getPrice()
	{
		return super.getPrice();
	}
}
class FlightTicket extends Ticket
{
	String from,to;
	int seatNo,luggageWeight;
	double price;
	final double insaurancePercent=0.01,extraLuggagePercentage=0.03;
	public FlightTicket(String from,String to,int seatNo,double price,int luggageWeight)
	{
		super(from,to,seatNo,price);
		this.luggageWeight=luggageWeight;
	}
	public double getPrice()
	{   double basePrice=super.getPrice();
		double finalPrice;
		if(this.luggageWeight>15)
		{
			finalPrice=basePrice+((basePrice*insaurancePercent)+(basePrice*extraLuggagePercentage));
		}
		else
		{
			finalPrice=basePrice+((basePrice*insaurancePercent));
		}
		return finalPrice;
	}
}

class BookTicketMain
{
	public static double calculateTotalPrice(Ticket t[])
	{   double totalPrice=0.0;
		int l=t.length;
		for(int i=0;i<l;i++)
		{
			totalPrice+=t[i].getPrice();
		}
		return totalPrice;
	}
	public static void main(String args[])
	{
		Ticket t[]=new Ticket[10];
		t[0]=new BusTicket("place1","price2",10,50.0);
		t[1]=new BusTicket("place3","price4",11,50.0);
		t[2]=new TrainTicket("place1","price2",10,500.0,"SL");
		t[3]=new TrainTicket("place3","price4",11,500,"3A");
		t[4]=new TrainTicket("place5","price6",12,500,"3A");
		t[5]=new FlightTicket("place1","price2",10,50.0,10);
		t[6]=new FlightTicket("place3","price4",11,50.0,15);
		t[7]=new FlightTicket("place1","price2",10,500.0,20);
		t[8]=new FlightTicket("place3","price4",11,500,5);
		t[9]=new FlightTicket("place5","price6",12,500,3);
		System.out.println("Totalprice is "+calculateTotalPrice(t));
	}
}
		
		
		
			

	

