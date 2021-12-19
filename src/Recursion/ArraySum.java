/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Recursion;

/**
 * @author Administrator
 * @date 2021/6/3023:42
 */
public class ArraySum {
	public static int sum(int[] arr) {
		return sum2(arr,0);
	}

	//计算arr[l...n]这个区间的所有数字的和
	private static int sum(int[] arr,int l) {
		int sum = 0;
		if (l==arr.length) {
			sum = 0;
		}
		else {
			sum = arr[l]+sum(arr,l+1);
		}
		return sum;
	}

	private static int sum2(int[] arr,int l) {
		if (l==arr.length) {
			return 0;
		}
		//相当于循环调用，做了个l++操作
		return arr[l]+sum(arr,l+1);

	}
}