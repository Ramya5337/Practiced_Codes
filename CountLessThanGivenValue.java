import java.io.*;
public class CountLessThanGivenValue {
// Simple linear traversal for counting
		    static int countOfElements(int arr[], int n, int key)
		    {
		        // here the index is used as count
		 
		        // declared a variable to count
		        int i = 0;
		 
		        for (i = 0; i < n; i++) {
		 
		            // break when find
		            // greater element
		            if (arr[i] > key)
		                break;
		        }
		 
		        // return the count
		        return i;
		    }
		    public static void main(String[] args)
		    {
		        int arr[] = { 1, 2, 4, 5,7, 8, 10 };
		        int key = 6;
		        int n = arr.length;
		        System.out.print(countOfElements(arr, n, key));
		    }
		 
}

