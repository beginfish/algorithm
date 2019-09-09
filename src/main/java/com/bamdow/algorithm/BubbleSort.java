package com.bamdow.algorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] data){
		assert data!=null?true:false;
		int len = data.length;
		for(int i=len-1;i>0; i--){
			for(int j=0;j<i;j++){
				if( data[j] > data[j+1] ){
					int temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
				}
			}
			System.out.println("i:"+i+"="+Arrays.toString(data));
		}
	}
	
	public static void main(String[] args) {
		int[] data = {9,1,5,3,7,4,2};
		System.out.println("before:"+Arrays.toString(data));
		sort(data);
		System.out.println("after:"+Arrays.toString(data));
	}
}
