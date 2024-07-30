package ramya;

public class SortingArray{
	int arr[]= {3,1,45,3,22,10,100};
	int n=arr.length; 
	synchronized public void sort() {//method to sort an array
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)//printing array after sorting
		{
			System.out.println(arr[i]);
		}
			
		
	}

	public static void main(String[] args) {
		SortingArray s=new SortingArray();//creating object
		new Thread() {//thread one
		public void run() {
			s.sort();//calling method
		}
		}.start();
		
		new Thread() {//thread two
			public void run() {
				s.sort();//calling method
			}
		}.start();
	

	}

}

/*
 output:after running two threads we used synchronized 
 so it done the task one after other
1
3
3
10
22
45
100
1
3
3
10
22
45
100
*/
