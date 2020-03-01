package com.firstModule;

public class Palindrome {
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		// System.out.println(palindrome.isPalindrome("aba"));
		// System.out.println(palindrome.isPalindrome("abc"));

		System.out.println(palindrome.isPalindromeNumber(1234));
		System.out.println(palindrome.isPalindromeNumber(121));
	}

	/**
	 * Check is the given String is palindrome using StringBuffer	 * 
	 * @param text
	 * @return true if the input is palindrome
	 */
	public boolean isPalindrome(String text) {
		StringBuffer br = new StringBuffer();
		for (int i = text.length() - 1; i >= 0; i--) {
			br.append(text.charAt(i));
		}
		if (br.toString().equals(text))
			return true;
		else
			return false;
	}

	/**
	 * @param number
	 * @return true if the number is palindrome
	 */
	public boolean isPalindromeNumber(int number) {
		int originalNumber = number;
		int temp = 0, result = 0;
		while (number != 0) {
			temp = number % 10;
			number /= 10;
			result = result * 10 + temp;
		}
		return (result == originalNumber);
	}

}
