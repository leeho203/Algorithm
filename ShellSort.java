package com.project.sort;

import java.util.Arrays;

public class ShellSort {
	public static void main(String args[]) {
		int arr[] = { 485, 241, 454, 325, 452, 685, 498, 890, 281, 175,
						354, 203, 23, 168, 998, 678, 472, 444, 123, 593,
						100, 200, 300, 900, 800, 777, 382, 555, 342, 132};
		int len = arr.length;
		shellSort(arr, len);
		System.out.println(Arrays.toString(arr));
	}

	public static void shellSort(int[] arr, int len) {
		int i, j, m, insertData;
		int interval = len;
		while (interval != 1) {
			interval = interval / 4 + 1;								//	interval ��� �پ��� 1�� �Ǹ� ����
			for (m = 0; m < interval; m++) {
				for (i = m + interval; i < len; i += interval) {		//	interval �������� ���������� ����
					insertData = arr[i];
					for (j = i - interval; j >= 0; j-=interval) {
						if (arr[j] > insertData) {
							arr[j + interval] = arr[j];
						} else {
							break;
						}
					}
					arr[j + interval] = insertData;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
