package com.project.search;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] { 1, 3, 4, 5, 6, 8, 10, 12, 13 };
		int num;
		while (sc.hasNext()) {
			num = sc.nextInt();
			System.out.println("Answer : " + binarySearch(arr, num));
		}
	}

	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;

			if (target < arr[mid]) {
				right = mid - 1;
			} else if (target > arr[mid]) {
				left = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}
