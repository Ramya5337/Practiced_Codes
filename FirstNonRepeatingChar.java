package demo1;
import java.util.Scanner;
public class FirstNonRepeatingChar {
//method to to find unique character
    public static int findUniqueChar(String s)
    {
    	Outer:for(int i=0;i<s.length();i++)//outer for loop
        {
        	for(int j=0;j<s.length();j++)
        	{
        		if(i!=j && s.charAt(i)==s.charAt(j))
        		{
        			continue Outer;
        		}
        		
        	}
        	return i;//returning first unique char index number
        }
    	return -1;//returning -1 if their are no unique characters
    }
	public static void main(String[] args) {
		// using scanner class to take input from user
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.next();//taking input from user
        System.out.println(findUniqueChar(s));//calling the method and printing result
        
        
	}

}

/* output
Enter a String
aabb
-1
*/
