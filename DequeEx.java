import java.util.Deque;
import java.util.ArrayDeque;
public class DequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque dq=new ArrayDeque();
		System.out.println(dq);
		dq.addFirst(100);//adds element at first
		dq.add("ramya");
		dq.add("ramya");//allows duplicates
		dq.add("sowmya");
		dq.add(50);
		//dq.add(null); deque does not allow null values
		System.out.println(dq);
		dq.addLast(500);//adds element at last
		System.out.println(dq);
		System.out.println(dq.peek());//finds first element
		dq.poll();//removes first elements 
		System.out.println(dq);
		dq.remove("sowmya");//removes perticular element
		System.out.println(dq);
		dq.removeFirst();//removes first element
		System.out.println(dq);
		dq.removeLast();//remove last element
		System.out.println(dq);
		
		
	}

}
