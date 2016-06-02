package com.project.sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String args[]) {
		int[] arr = { 5, 3, 2, 1, 4, 6, 10, 8, 7 };
		int insertData;
		int i, j;
		for (i = 1; i < arr.length; i++) {
			insertData = arr[i];
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > insertData) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = insertData;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
