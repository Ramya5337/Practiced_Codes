//bank which extends withdraw and deposit
public class Bank extends Withdraw{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deposit d=new Deposit();//creating object for deposit class
		Thread t1=new Thread(d);//creating thread and assigning deposit calss obj
		
		t1.start();//calling start and it executes run method of deposit
		Withdraw w=new Withdraw();
		Thread t2=new Thread(w);
		try {
			t2.sleep(10000);//sleeping thread for 10sec
		}
		catch(Exception e) {}
		t2.start();//calling start and it executes run method of withdraw

	}

}
/*
balance the account50000
Enter amount to deposit
3000
deposit amount3000
balance in the account after deposit53000
Enter amount to withdraw
3000
withdraw amount3000
after withdrawing balance in the account is47000

*/
