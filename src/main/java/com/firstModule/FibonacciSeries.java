package com.firstModule;

public class FibonacciSeries {

	int n1 = 1, n2, n3;

	public static void main(String[] args) {
		new FibonacciSeries().printFibonacciSeries(10);
		new FibonacciSeries().usingForLoop(10);
		new FibonacciSeries().recFibonacci(10);
	}

	public void recFibonacci(int n) {
		if (n > 0) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			recFibonacci(n - 1);
		}

	}

	/**
	 * print Fibonacci series up to nth Number
	 * 
	 * @param n
	 */
	public void printFibonacciSeries(int n) {
		System.out.println("0\n1");
		int j = 1, k = 0;
		do {
			j = j + k;
			System.out.println(j); // j=2
			k = j - k;
			n--;
		} while (n > 2);

	}

	public void usingForLoop(int n) {
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.println("0\n1");
		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
