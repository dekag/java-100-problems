package com.firstModule;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		for(int i=50;i<100;i++) {
			if(i%1 == i%i)
				System.out.println("Prime"+i);
		}
	}

}
