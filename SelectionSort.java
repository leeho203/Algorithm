package com.project.sort;

public class SelectionSort {
	public static void main(String args[]) {
		
		int[] arr = new int[] { 15, 11, 37, 9, 35, 47, 20, 27 };

		int indexMin, temp;

		for (int i = 0; i < arr.length; i++) {
			indexMin = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[indexMin]) {
					indexMin = j;
				}
			}
			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
