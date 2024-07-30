import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //taking input string from user
		System.out.println("enter a string");
		StringBuffer str=new StringBuffer(sc.next());
	    System.out.println(str.reverse()); //using inbuilt method to reverse a string

	}

}
