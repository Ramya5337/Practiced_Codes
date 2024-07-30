import java.util.*;
public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		//taking input as how elements want to add
		System.out.println("enter how many elements you want to add in array list");
		int n=sc.nextInt();
		//using for loop to add elements into array list
		
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		//sorting array list
		al.sort(null);
		System.out.println(al);

	}

}
