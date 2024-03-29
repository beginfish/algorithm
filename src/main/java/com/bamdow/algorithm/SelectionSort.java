package com.bamdow.algorithm;

import java.util.Arrays;

/**
 * 选择排序
 * @author Bamboo
 *
 */
public class SelectionSort {

	public static void sort(int[] data){
		assert data!=null?true:false;
		int len = data.length;
		for(int i=0;i<len-1; i++){
			for(int j=i+1;j<len;j++){
				if( data[i] > data[j] ){
					int temp = data[j];
					data[j] = data[i];
					data[i] = temp;
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
