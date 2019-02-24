package com.firstModule;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		//System.out.println(linearSearch());
		binarySearch();
	}

	/**
	 * program for linear search
	 * @return true if number is found else false
	 */
	public static boolean linearSearch() {
		int[] nums = { 2, 4, 6, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to search ");
		int num = sc.nextInt();

		for (int n : nums) {
			if (n == num)
				return true;
		}
		return false;
	}
	
	/**
	 * program for binary search
	 * 
	 */
	public static void binarySearch() {
		int[] nums = {2,4,6,8};
		
		int item, location = -1;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to search !");
		item = sc.nextInt();
		
		location = binarySearchItem(nums,0,nums.length,item);
		if(location != -1)
			System.out.println("Found at "+location);
		else 
			System.out.println("Not Found");
	}

	/**
	 * @param nums
	 * @param beg
	 * @param end
	 * @param item
	 * @return position of the number
	 */
	public static int binarySearchItem(int[] nums, int beg, int end, int item) {
		int mid;
		
		if(end >= beg) {
			mid = (end+beg)/2;
			System.out.println("Mid "+mid);
			if(nums[mid] == item)
				return mid+1;
			else if(nums[mid]<item)
				return binarySearchItem(nums, mid+1, end, item);
			else
				return binarySearchItem(nums, beg, mid-1, item);
		}		
		return -1;
	}
}
