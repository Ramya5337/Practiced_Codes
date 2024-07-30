import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList(5);
		/*System.out.println(arr);
		arr.add(10);
		System.out.println(arr);
		arr.add(19.8);
		arr.add(19.8);
		System.out.println(arr);
		arr.add("ramya");
		System.out.println(arr);
		arr.add(null);
		System.out.println(arr);
		arr.remove(3);
		System.out.println(arr);
		System.out.println(arr.size());
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee names");
		for(int i=0;i<arr.size();i++)
		{
			String s=sc.next();
			arr.add(s);
		}
		System.out.println(arr);
	}

}
