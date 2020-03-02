package Week3Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

class Week3TestAccount
{
	String name;
	int id,balance;
	public Week3TestAccount(String name, int id, int balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Week3TestAccount [name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}
	
}
public class Week3ExamQ2 {
	
	public static int compareAccount(Week3TestAccount account1,Week3TestAccount account2)
	{
		if(account1.getBalance()>account2.getBalance())
		{
			return 1;
		}
		else if(account1.getBalance()<account2.getBalance())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String args[]) {
		Week3TestAccount a1=new Week3TestAccount("Priyam", 1, 5000);
		Week3TestAccount a2=new Week3TestAccount(" Singh", 1, 35000);
		Week3TestAccount a3=new Week3TestAccount("Raj", 1, 15000);
		Week3TestAccount a4=new Week3TestAccount("Hemant", 1, 25000);
		Comparator<Week3TestAccount> accountComparator=Week3ExamQ2::compareAccount;
		TreeSet<Week3TestAccount> treeSet=new TreeSet<Week3TestAccount>(accountComparator);
		treeSet.add(a1);
		treeSet.add(a2);
		treeSet.add(a3);
		treeSet.add(a4);
		Consumer<Week3TestAccount> consumer=(Week3TestAccount account)->System.out.println(account);
		
		Iterator<Week3TestAccount> itr=treeSet.iterator();
		while(itr.hasNext())
		{
			consumer.accept(itr.next());
		}
		
	}

}
