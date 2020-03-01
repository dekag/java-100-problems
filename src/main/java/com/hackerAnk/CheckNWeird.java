package com.hackerAnk;

import java.util.Scanner;

public class CheckNWeird {

	/*
	 * Task Given an integer, , perform the following conditional actions:
	 * 
	 * If is odd, print Weird If is even and in the inclusive range of to , print Not Weird If is even and in the inclusive
	 * range of to , print Weird If is even and greater than , print Not Weird Complete the stub code provided in your
	 * editor to print whether or not is weird.
	 */

	public static void main(String[] args) {
		//new CheckNWeird().checkN();
		new CheckNWeird().readDetails();
	}

	public void checkN() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = in.nextInt();

		if (n % 2 == 0) {
			if (n >= 2 && n <= 5)
				System.out.println(n + "Not weird");
			else if (n >= 6 && n <= 20)
				System.out.println(n + "Weird");
			else
				System.out.println(n + "Not Weird");

		} else
			System.out.println(n + " is odd");

		in.close();

	}
	
	public void readDetails() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = scn.nextInt();
		
		System.out.println("Enter any double number");
		double d = scn.nextDouble();
		
		System.out.println("Enter any string");
		String text = scn.next();
		text+=scn.nextLine();
		
		System.out.println("String: "+text);
		System.out.println("Double: "+d);
		System.out.println("Int: "+n);
		
		scn.close();
		
	}

}












