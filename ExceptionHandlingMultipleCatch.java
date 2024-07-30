import java.util.*;
public class ExceptionHandlingMultipleCatch {
	//exception handling with multiple catch blocks
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int age;
		//assigning null
		int arr[]=null;
		try {
		System.out.println(arr[1]);
		age=sc.nextInt();
		}
		//handling null ponter exception
		catch(NullPointerException n) {
			
			System.out.println("error occured");
			System.out.println("the does not have any values");
		
		}
		//handling input mismatch exception
		catch(InputMismatchException i) {
			System.out.println("error occured");
			System.out.println("please enter valid input");
			
		}
		//handling any kind of exceptions
		catch(Exception e) {
			System.out.println("error occured");
		}
		//finally block executes always
		finally {
			System.out.println("this block executes either exception thrown or not");
		}
		
	}

}
