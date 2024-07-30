package demo1;
import java.util.*;
public class KmostFrequentWords {
	    public static ArrayList<String>
	    frequentWords(ArrayList<String> arr, int K)
	    {

	        // Hash map to store the frequency
	        // of each string
	        HashMap<String, Integer> Freq= new HashMap<>();

	        // Set the default frequency of each string 0
               for (String word : arr) {
	            Freq.put(word,Freq.getOrDefault(word, 0)+ 1);
	        }

	        // Using a priority queue to store
	        // the strings in accordance of the
	        PriorityQueue<String> Order= new PriorityQueue<>((a, b)-> (Freq.get(a) != Freq.get(b))
	                           ? Freq.get(a) - Freq.get(b)
	                           : b.compareTo(a));

	        // Traverse the HashMap
	        for (String word : Freq.keySet()) {
	            Order.offer(word);

	            // Remove top (N - K) elements
	            if (Order.size() > K) {
	                Order.poll();
	            }
	        }

	        // Order queue has K most frequent strings in a reverse order
	        ArrayList<String> ans = new ArrayList<>();

	        while (!Order.isEmpty()) {
	            ans.add(Order.poll());
	        }

	        // Reverse the ArrayList so as
	        // to get in the desired order
	        Collections.reverse(ans);

	        return ans;
	    }

	    public static void main(String[] args)
	    {
	        int N = 3, K = 2;

	        // Given array
	        ArrayList<String> arr= new ArrayList<String>();
	        arr.add("i");
	        arr.add("love");
	        arr.add("coding");
	        arr.add("i");
	        arr.add("love");
	        arr.add("mycountry");
	        // calling function
	        ArrayList<String> ans= frequentWords(arr, K);
               for (String word : ans) {
	            System.out.println(word + " ");
	        }
	    }
}
         
/*output:
i 
love
*/ 

