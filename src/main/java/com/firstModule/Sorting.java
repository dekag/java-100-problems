package com.firstModule;

/**
 * program for various sorting algorithms
 * 
 * @author gadeka
 *
 */
public class Sorting {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 7, 5, 6, 9 };
		bubbleSort(nums);
		insertionSort(nums);
		selectionSort(nums);
	}

	/**
	 * In Bubble sort, Each element of the array is compared with its adjacent element Space - O(1) Worst case running time
	 * - O(n2) Average case running time - O(n) Best case running time - O(n2)
	 * 
	 * @param nums
	 */
	public static void bubbleSort(int[] nums) {
		int temp;
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		for (int i : nums) {
			System.out.printf("%d ", i);
		}
	}

	/**
	 * Insertion sort is the simple sorting algorithm which is commonly used in the daily lives while ordering a deck of
	 * cards. In this algorithm, we insert each element onto its proper place in the sorted array. This is less efficient
	 * than the other sort algorithms like quick sort, merge sort, etc.
	 * 
	 * @param nums
	 */
	public static void insertionSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			int j = i - 1;

			while (j >= 0 && temp <= nums[j]) {
				nums[j + 1] = nums[j];
				j = j - 1;
			}
			nums[j + 1] = temp;
		}
		System.out.println();
		for (int i : nums) {
			System.out.printf("%d ", i);
		}
	}

	/**
	 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
	 * from unsorted part and putting it at the beginning	 * 
	 * @param nums
	 */
	public static void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[minIndex])
					minIndex = j;
			}
			int temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;
		}	
		
		System.out.println();
		for (int i : nums) {
			System.out.printf("%d ", i);
		}
	}

}
