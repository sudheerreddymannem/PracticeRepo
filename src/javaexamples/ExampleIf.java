package javaexamples;

import java.util.Scanner;

public class ExampleIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		
		System.out.println("Enter Your age");


		
		if(age>21)
		{
			System.out.println("Age is greater than 18");
		}else
		{
			System.out.println("Age is Less than 18");
		}



	}

}
