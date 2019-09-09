package com.bamdow.algorithm;

import java.util.Arrays;

/**
 * 快速排序
 * @author Bamboo
 *
 */
public class QuickSort {

	public static void sort(int[] data){
		int start=0,end=data.length-1;
		quickSort(data,start,end);
	}
	
	private static void quickSort(int[] data,int start,int end){
		if(start >= end){
			return;
		}
		int pivot = data[start];
		int low=start,high=end;
		while( low < high ){
			// 从右边开始比较，比pivot大的数位置不变
			while(  low < high && data[high] >= pivot) {
				high -= 1;
	        }
			data[low] = data[high];
			//从左边开始比较，比pivot小的数位置不变
			while(  low < high && data[low] <= pivot) {
				low += 1;
	        }
			data[high]=data[low];
		}
		data[low] = pivot;
		System.out.println("low:"+low+","+Arrays.toString(data));
		quickSort(data,start,low-1);
		quickSort(data,low+1,end);
	}
	
	public static void main(String[] args) {
		int[] data = {1,6,5,3,7,4,2};
		//int[] data = {1,2,3,4,5,6,7};
		System.out.println("before:"+Arrays.toString(data));
		sort(data);
		System.out.println("after:"+Arrays.toString(data));
	}
}
