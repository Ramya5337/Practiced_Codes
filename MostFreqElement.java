package demo1;
import java.util.Scanner;
public class MostFreqElement {
	
//method to find most frequent number in array
	public static int findMostFreqEle(int arr[]){
		
		int max=0;
		int repeating_Num=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				repeating_Num=arr[i];
			}
		}
		return repeating_Num;//returning repeating number
	}

	public static void main(String[] args) {
		// taking user input
		Scanner sc=new Scanner(System.in);
        int arr[]=new int[50];
        System.out.println("enter how many array elements you want");
        int n=sc.nextInt();
        System.out.println("enter values");
        for(int k=0;k<n;k++)
        {
        	arr[k]=sc.nextInt();//taking input from user
        }
        System.out.println(findMostFreqEle(arr));//calling method
        
	}

}
