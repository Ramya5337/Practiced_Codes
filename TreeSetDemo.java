package atm;
import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet ename=new TreeSet();
        System.out.println(ename);
        ename.add("virat");
        //ename.add(90); we cannot give heteogeneous data
        ename.add("virat");
        ename.add("rohit");
        //ename.add(100);we cannot compare elements with different types
        ename.add("hardik");
        ename.add("sky");
        //ename.add(true);
        System.out.println(ename);
        
	}

}
