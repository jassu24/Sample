package miit;

import java.util.Scanner;

public class Scannerexample {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=s.nextLine();//get input from user
		System.out.println("Enter your Age");
		int age=s.nextInt();
		System.out.println("Hello "+name+ " you are " + age);;
		
	}
}
