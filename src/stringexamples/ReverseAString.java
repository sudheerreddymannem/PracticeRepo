package stringexamples;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a String :");
		String s1=scan.next();
		
		//String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			//rev+=s1.charAt(i);
			System.out.print(s1.charAt(i));
		}
		//System.out.println("reversed String is: "+rev);
	}

}
