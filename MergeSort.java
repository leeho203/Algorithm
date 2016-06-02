package com.project.sort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String args[]) {
		/*
		 * ��������(��������) ���������� arrA, arrB�� ���� ������ �Ǿ� �־���� 
		 * arrC�� arrA.length + arrB.length�� ũ�⸦ ����				
		 * 															*/
		int[] arrA = new int[] { 0, 1, 2, 3, 4, 5 };		//	�������� ��� �迭A
		int[] arrB = new int[] { 1, 3, 4, 5, 6, 7 };		//	�������� ��� �迭B
		int[] arrC = new int[arrA.length + arrB.length]; 	// ���������� �ؼ� ������ �迭
		mergeSort(arrA, arrB, arrC);
		System.out.println(Arrays.toString(arrC));
	}

	public static void mergeSort(int[] arrA, int[] arrB, int[] arrC) {
		int iA = 0; 										// arrA ������
		int iB = 0; 										// arrB ������
		int iC = 0; 										// arrC ������
		while (iA < arrA.length && iB < arrB.length) {		//	iA�� iB�� ������ �� �� ����
			if (arrA[iA] < arrB[iB]) {
				arrC[iC] = arrA[iA];
				iA++;
			} else {
				arrC[iC] = arrB[iB];
				iB++;
			}
			iC++;	
		}
		
		while(iA<arrA.length){								//	arrB�� �� ó���Ǿ��µ� arrA�� ó�� �ȵǾ��� ���
			arrC[iC] = arrA[iA];
			iA++;
			iC++;
		}
		
		while(iB<arrB.length){								//	arrA�� �� ó���Ǿ��µ� arrB�� ó�� �ȵǾ��� ���
			arrC[iC] = arrB[iB];
			iB++;
			iC++;
		}
		

	}
}
