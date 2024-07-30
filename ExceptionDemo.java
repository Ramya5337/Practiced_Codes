import java.util.*;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};//array initialization and declaration
		int a,b,c=0;
		//taking input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		
		//here we get exceptions
		try{
			b=sc.nextInt();
		
		    c=a/b;
		    System.out.println(arr[8]);
		}
		//handling arithmetic exception
		catch(ArithmeticException ae)
		{
			System.out.println("error occure");
			System.out.println("enter b value");
			b=sc.nextInt();
			c=a/b;
		}
		//handling array index out of bounds exception
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("the index should not be more than the length of array");
			System.out.println(arr[2]);
		}
		System.out.println("c value is "+c);
		

	}

}
