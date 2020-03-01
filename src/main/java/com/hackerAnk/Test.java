package com.hackerAnk;

public class Test {

	public static void main(String[] args) {
		for(int i=1; i<100; i++){
			if(i%15==0)
				{
					System.out.println("GC");
					System.out.println("G");
					System.out.println("C");
				}
			
			else if(i%3 == 0)
				System.out.println("G");
			else if(i%5 == 0)
				System.out.println("C");			
			else
				System.out.println(i);
		}

	}

}
