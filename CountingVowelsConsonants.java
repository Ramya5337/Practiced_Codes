import java.util.Scanner;
public class CountingVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels=0,consonants=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str1=new String(sc.next()); //taking input sting from user
		String str=str1.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			//counting vowels
			if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				
				vowels++;
			}
			//counting consonants
			else if((str.charAt(i)!='a' ||str.charAt(i)!='e'||str.charAt(i)!='i'||str.charAt(i)!='o'||str.charAt(i)!='u')&&(str.charAt(i) >= 'a' && str.charAt(i)<='z')){
				
				consonants++;
			}
				
			
				
		}
		//printing vowels and consonant counts
		System.out.println("vowels count="+vowels);
		System.out.println("consonants count="+consonants);

	}

}
