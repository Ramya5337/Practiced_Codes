package demo1;
import java.util.concurrent.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* ConcurrentMap<String,Integer> cm=new ConcurrentHashMap<String,Integer>();
         cm.put("ramya", 100);
         cm.put("ram",300);
         cm.put("virat",300);
         System.out.println(cm);
         cm.put("ram",3000);
         cm.put("ram",30000);//updates key value
         System.out.println(cm);
         cm.put("virat1",300);
         System.out.println(cm);
         cm.remove("virat1");
         System.out.println(cm);
         cm.replace("ramya", 100, 1000);
         System.out.println(cm);
        int v=cm.get("ram");
        System.out.println(v);
        */
		ConcurrentMap<Integer,Integer> cm=new ConcurrentSkipListMap<Integer,Integer>();
        cm.put(101, 50);
        cm.put(102, 70);
        cm.put(103, 90);
        System.out.println(cm);
        System.out.println(cm.get(102));
        System.out.println(cm.values());
        
	}

}
