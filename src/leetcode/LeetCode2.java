/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package leetcode;

/**
 * @author Administrator
 * @date 2021/7/10:01
 */
public class LeetCode2 {
	//是否是2的幂
	public boolean isPowerOfTwo(int n) {
		if (n<=0){return false;}
		else{
			if (n==1){return true;}
			if (n%2==1){return false;}
			return isPowerOfTwo(n/=2);
		}
	}
	//2的幂
	private int powerOfTwo(int n) {
		if (n==0) {
			return 1;
		}
		if (n==1) {
			return 2;
		}
		return 2*powerOfTwo(n-1);
	}

	//是否是2的幂
	public boolean isPowerOfThree(int n) {
		if (n<=0){return false;}
		else{
			if (n==1){return true;}
			if (n%3==1){return false;}
			return isPowerOfTwo(n/=3);
		}
	}

	public int fib(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		return fib(n-1)+fib(n-2);
	}
}