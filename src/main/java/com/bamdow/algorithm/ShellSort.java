package com.bamdow.algorithm;

import java.util.Arrays;

/**
 * 希尔排序
 * @author Bamboo
 *
 */
public class ShellSort {

	public static void sort(int[] data){
		assert data!=null ? true:false;
		int len = data.length;
		for(int gap=len/2;gap>0; gap/=2){
			for(int i=gap;i<len; i++){
				for(int j=i-gap;j >= 0 && data[j] > data[j+gap];j-=gap){
					int temp = data[j];
					data[j] = data[j+gap];
					data[j+gap] = temp;
				}
				System.out.println("i:"+i+"="+Arrays.toString(data));
			}
		}

	}
	
	public static void main(String[] args) {
		int[] data = {9,1,5,3,7,4,2};
		System.out.println("before:"+Arrays.toString(data));
		sort(data);
		System.out.println("after:"+Arrays.toString(data));
	}
}
