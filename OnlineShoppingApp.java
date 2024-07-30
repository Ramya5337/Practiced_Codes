package ramya;
import java.util.*;
class Customer{
	Scanner sc=new Scanner(System.in);
	synchronized void order()//synchronized method order
	{
		System.out.println("try to make your order");
		System.out.println("after ordering kindly do your payment to confirm your order");
		try {
			wait();//making this thread to wait
		}
		catch(Exception e) {}
		System.out.println("order is confirmed");
	}
	synchronized void payment()//synchronized method payment
	{
		System.out.println("do your payment here");
		System.out.println("select your payment  option? 1.phonepe 2.gpay 3.paytm");
		//using scanner to take input from user
		String payment_op=sc.next();
		System.out.println("enter your amount");
		int payment_amount=sc.nextInt();
		System.out.println("payment done");
		notify();//notifying previous thread to resume its execution
	}
}
public class OnlineShoppingApp {

	public static void main(String[] args) {
	
		final Customer c=new Customer();//other thread cannot able to use object c
		new Thread() {//creating one thread for order method
			public void run() {
				c.order();
			}
			
		}.start();
		new Thread() {//creating second thread for payment method
			public void run() {
				c.payment();
			}
			
		}.start();

	}

}

/*
ouput:
try to make your order
after ordering kindly do your payment to confirm your order
do your payment here
select your payment  option? 1.phonepe 2.gpay 3.paytm
gpay
enter your amount
4000
payment done
order is confirmed
*/
