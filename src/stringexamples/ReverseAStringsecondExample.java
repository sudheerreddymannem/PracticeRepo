package stringexamples;

import java.util.Scanner;

public class ReverseAStringsecondExample {

	public static void main(String[] args) {
		// Without Using String Methods
		System.out.println("Enter the String to be Reversed :");
		
		Scanner scan= new Scanner(System.in);
		String reversed=scan.nextLine();
		
		char[] cha=reversed.toCharArray();
		
		for(int i=cha.length-1;i>=0;i--)
		{
			System.out.print(cha[i]);
		}

	}

}
