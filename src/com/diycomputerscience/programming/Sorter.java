package com.diycomputerscience.programming;

public class Sorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[] = {4, 3, 5, 6, 2};		
		sort(nums);
		print(nums);
	}

	/**
	 * This method accepts an array of integers, sorts the array and prints
	 * the sorted array
	 * @param nums An array of integers
	 * 
	 * Note: This method should be refactored because it violates the single 
	 * responsibility principle. Use extract method to extract the printing code
	 * and moving it into a method of it's own
	 * 
	 */
	private static void sort(int[] nums) {
		//sort
		int n = nums.length;
		for (int i = 1; i < n; i++){
			int j = i;
			int B = nums[i];
			while ((j > 0) && (nums[j-1] > B)){
			  nums[j] = nums[j-1];
			  j--;
			}
			nums[j] = B;
		}
		
	}
	
	public static void print(int nums[]) {
		//print
		for(int i : nums) {
			System.out.print(i + " ");
		}
	}
	
}
