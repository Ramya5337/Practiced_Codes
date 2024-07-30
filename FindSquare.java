
//finding square of numbers of array
public class FindSquare extends FindAvg{//inheriting findavg class
		public void run()//overriding run method which is in runnable interface
		{
			int arr[]={10,15,20,25,30};
			for(int j=0;j<arr.length;j++)
			{
				System.out.println("square of array values"+arr[j]*arr[j]);
				try {
				Thread.sleep(1000);//sleeping thread for 1sec
				}
				catch(InterruptedException ie) {}
			}
		}
}

/*
OUTPUT:
square of array values100
average25
square of array values225
square of array values400
square of array values625
square of array values900
*/
