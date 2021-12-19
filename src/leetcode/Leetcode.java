package Leetcode;/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

import java.util.ArrayList;

/**
 * @author Administrator
 * @date 2021/4/2722:01
 */
public class Leetcode {
	public static void main(String[] args) {
		/*System.out.println(4^3);
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		reversePrint(head);*/
		int[] nums = {3,4,5,2};
		maxProduct(nums);
	}

	public static int maxProduct(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i]>nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return (nums[0]-1)*(nums[1]-1);
	}

	public int xorOperation(int n, int start) {
		//定义数组长度
		int[] nums = new int[n];
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = start + 2*i;
			result = result^nums[i];
		}
		return result;
	}

	public int[] runningSum(int[] nums) {
		int result = 0;
		int[] resultNums = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result += nums[i];
			resultNums[i] = result;
		}
		return resultNums;
	}
	//剑指 Offer 58 - II. 左旋转字符串
	public String reverseLeftWords(String s, int n) {
		StringBuilder sb = new StringBuilder();
		sb.append(s.substring(n,s.length()));
		sb.append(s.substring(0,n));
		return sb.toString();
	}
	//链表删除节点
	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}


	public int numJewelsInStones(String jewels, String stones) {
		char[] stone = stones.toCharArray();
		char[] jewel = jewels.toCharArray();
		int count = 0;
		for (int i = 0; i < jewel.length; i++) {
			for (int j = 0; j < stone.length; j++) {
				if (stone[j]==jewel[i]) {
					count++;
				}
			}
		}
		return count;
	}

	public int maximumWealth(int[][] accounts) {
		int sum=0;
		int res=0;
		for(int i=0;i<accounts.length;i++){
			for(int j=0;j<accounts[i].length;j++){
				sum +=accounts[i][j];
			}
			res=Math.max(res,sum);
			sum=0;
		}
		return res;
	}
	//反转链表
	/*public ListNode reverseList(ListNode head) {
		ListNode node = new ListNode();

		for (int i = 0; i < 5000; i++) {
			node = head.next;
			node.val = head.next.val;
		}
		return node;
	}*/

	public static int[] reversePrint(ListNode head) {
		ArrayList resultr = new ArrayList();
		int index = 1;
		ListNode prev = head;
		out:for (int i = 0; i < 1000; i++) {
			prev = prev.next;
			if (prev!=null) {
				index++;
			}else{
				break out;
			}
		}
		ListNode curr = head;
		for(int i=0;i<index;i++) {
			if (i==0){
				resultr.add(head.val);
			}
			curr = curr.next;
			if (curr!=null) {
				resultr.add(curr.val);
			}
		}
		int[] result = new int[index];
		if(resultr != null) {
			for(int j=0;j<index;j++){
				result[j] = (int) resultr.get(index-1-j);
			}
		}
		return result;
	}

	public String replaceSpace(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==' ') {
				sb.append("%20");
			}else {
				sb.append(s.substring(s.charAt(i)));
			}

		}
		return sb.toString();
	}


	public String toLowerCase(String s) {
		StringBuilder sb = new StringBuilder();
		for (char ch :s.toCharArray()) {
			if (ch>='A'&&ch<='Z') {
				sb.append((char)(ch+32));
			}else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}



}