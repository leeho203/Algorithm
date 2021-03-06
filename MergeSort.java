package com.project.sort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String args[]) {
		/*
		 * 병합정렬(오름차순) 병합정렬의 arrA, arrB는 먼저 정렬이 되어 있어야함 
		 * arrC는 arrA.length + arrB.length의 크기를 가짐				
		 * 															*/
		int[] arrA = new int[] { 0, 1, 2, 3, 4, 5 };		//	병합정렬 대상 배열A
		int[] arrB = new int[] { 1, 3, 4, 5, 6, 7 };		//	병합정렬 대상 배열B
		int[] arrC = new int[arrA.length + arrB.length]; 	//	병합정렬을 해서 돌려줄 배열
		mergeSort(arrA, arrB, arrC);
		System.out.println(Arrays.toString(arrC));
	}

	public static void mergeSort(int[] arrA, int[] arrB, int[] arrC) {
		int iA = 0; 						//	arrA 포인터
		int iB = 0; 						//	arrB 포인터
		int iC = 0; 						//	arrC 포인터
		while (iA < arrA.length && iB < arrB.length) {		//	iA나 iB가 끝까지 갈 때 종료
			if (arrA[iA] < arrB[iB]) {
				arrC[iC] = arrA[iA];
				iA++;
			} else {
				arrC[iC] = arrB[iB];
				iB++;
			}
			iC++;	
		}
		
		while(iA<arrA.length){		//	arrB는 다 처리되었는데 arrA가 처리 안되었을 경우
			arrC[iC] = arrA[iA];
			iA++;
			iC++;
		}
		
		while(iB<arrB.length){		//	arrA는 다 처리되었는데 arrB가 처리 안되었을 경우
			arrC[iC] = arrB[iB];
			iB++;
			iC++;
		}
		

	}
}
