package ramya;

public interface Bankinginterface {
public void deposit();
public void withdraw();
public void getbalance();
}
class SavingsAccount implements Bankinginterface
{
	
	int amount=10000;
	public void deposit()
	{
		amount=amount+2000;
	    System.out.println("amount after depositing"+amount);
	}
	public void withdraw()
	{
		amount=amount-3000;
		System.out.println("amount after withdrawing"+amount);
	}
	public void getbalance()
	{
		System.out.println("balance in the account"+amount);
	}
}
class CurrentAccount implements Bankinginterface
{
	int amount=20000;
	public void deposit()
	{
		amount=amount+500;
		System.out.println("amount after depositing"+amount);
	}
	public void withdraw()
	{
		amount=amount-1000;
		System.out.println("amount after withdrawing"+amount);
	}
	public void getbalance()
	{
		System.out.println("balance in the account"+amount);
	}
	
}
class Demo
{
	public static void main(String args[])
	{
		SavingsAccount sa=new SavingsAccount();
		sa.deposit();
		sa.withdraw();
		sa.getbalance();
		CurrentAccount ca=new CurrentAccount();
		ca.deposit();
		ca.withdraw();
		ca.getbalance();
	}
}
