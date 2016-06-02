package com.project.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        
        int[] arr = new int[]{6, 3, 9, 1, 2, 7};
        
        System.out.println("정렬 전 : "+Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("정렬 후 : "+Arrays.toString(arr));
        
    }
    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[left];
        int low = left + 1;
        int high = right;
        
        while(low <= high)
        {
            while(low <= right && pivot >= arr[low])
                low++;
            
            while(high >= left+1 && pivot <= arr[high])
                high--;
            
            if(low <= high)
            {
                swap(arr, low, high);
            }
        }
        
        swap(arr, left, high);
        
        return high;
    }
    
    public static void quickSort(int[] arr, int left, int right)
    {
        if(left <= right)
        {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot-1);
            quickSort(arr, pivot+1, right);
        }
    }
}