package com.firstModule;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFromStrings {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter any String ");
		String sentence = in.nextLine();
		//findWordFromStrings(sentence, "hello");
		//System.out.println(sentence);
		findWordUsingIndex(sentence, "hello");
		in.close();
		//findWordRegex(sentence, "hello");
	}
	
	// Schulmberger
	public static void findWordUsingIndex(String str, String search) {
		int lastIndex = 0;
		int count = 0;
		while (lastIndex != -1) {
			lastIndex = str.indexOf(search, lastIndex);
			if (lastIndex != -1) {
				lastIndex += search.length();
				count++;
			}
		}
		System.out.println(count);

	}

	public static void findWordFromStrings(String str, String search) {

		String[] find = str.split(search);
		for (String s : find)
			System.out.println(s);
		System.out.println(find.length - 1);

	}

	public static void findWordRegex(String str, String search) {
		Pattern patter = Pattern.compile(str);
		Matcher match = patter.matcher(search);
		if (match.find())
			System.out.println("Found at " + match.group());

	}
}
