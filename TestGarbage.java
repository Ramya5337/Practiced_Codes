package ramya;

public class TestGarbage {

	    public void finalize()  
	    {
	    System.out.println(" garbage collected object");
	   }

	  public static void main(String args[])
	 {
	 TestGarbage t=new TestGarbage();
	 TestGarbage t1=new TestGarbage();

	 System.out.println(t);
	 System.out.println(t1);

	 t=null;
	 t1=null;

	 System.out.println(t);
	 System.out.println(t1);

	 System.gc();// static method


	 }
	 }


