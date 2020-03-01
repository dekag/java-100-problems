package com.firstModule;

public class Reverse {

	public static void main(String[] args) {
		reverseNumber(123456);
		System.out.println(reverseString("gautam"));
	}

	/**
	 * Program to reverse a given number
	 * 
	 * @param number
	 */
	public static void reverseNumber(int number) {
		int result = 0;
		while (number != 0) {
			int temp = number % 10;
			result = result * 10 + temp;
			number /= 10;
		}
		System.out.println(result);
	}

	/**
	 * Program to reverse a given String
	 * 
	 * @param str
	 * @return reverse String
	 */
	public static String reverseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

}
