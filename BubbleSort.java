package com.project.sort;

public class BubbleSort {
	public static void main(String[] args){
		
		int arr[] = new int[]{2, 3, 5, 4, 7, 6, 7, 10, 1, 2};
		int temp;
		boolean isEnd;
		
		for(int i=0;i<arr.length-1;i++){
			isEnd=false;
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					isEnd=true;
				}
			}
			
			if(!isEnd){break;}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
