package stringexamples;

import java.util.Scanner;

public class ReverseAStringOfWords2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to be Reversed :");
		String str=scan.nextLine();
		
		String[] words=str.split(" ");
		
		for(int i=words.length-1;i>=0;i--)
		{
			String strToBeReversed=words[i];
			
			for(int j=strToBeReversed.length()-1;j>=0;j--) {
				
				System.out.print(strToBeReversed.charAt(j));
			}
			if(i!=0)
			{
				System.out.print(" ");
			}
		}
		
	}

}
