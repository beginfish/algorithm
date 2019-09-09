package com.bamdow.algorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 * 
 * <P>原理：</P>
 * 相邻2个元素比较,较大的元素向后冒泡
 * n个元素经过n-1趟比较之后所有元素归位
 * <P>思路：</P>
 *第1趟比较最大的元素被排到倒数最一位
 *第2趟比较第二大的元素被排到倒数第二位
 *~~
 *第n-2趟第三小的元素被排到顺数最三位
 *第n-1趟最小的二个的元素被排到正确的位置
 * @author Bamboo
 *
 */
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
