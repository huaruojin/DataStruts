/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Recursion;


import Utils.ListNode;

/**
 * @author Administrator
 * @date 2021/7/123:40
 * detail 实现删除链表中值为val的节点，返回删除后的链表
 */
public class Linked {

	//循环实现
	public static ListNode removeElements(ListNode head, int val) {
		while (head!=null&&head.val ==val) {
			//将下一个节点当现在的头节点，也就是抛弃了原来的头节点
			head = head.next;
		}
		if (head == null) {return  null;}
		ListNode prev = head;
		while(prev.next!=null) {
			//当前节点
			if (prev.next.val==val) {
				prev.next = prev.next.next;
			}else {
				//相当于i++
				prev = prev.next;
			}
		}
		return head;
	}
	//虚拟头节点实现
	public static ListNode removeElements2(ListNode head, int val) {
		ListNode dummyHead = new ListNode(val-1);
		dummyHead.next = head;
		//创建一个虚拟头节点，从而不需要去判断head是否满足条件
		ListNode prev = dummyHead;
		//只要下个节点不为空，开始循环
		while(prev.next != null) {
			if (prev.next.val == val){
				prev.next = prev.next.next;
			}else{
				prev = prev.next;
			}
		}
		return dummyHead.next;
	}

	//递归实现
	public static ListNode removeElements3(ListNode head, int val) {
		if (head ==null ) {
			return null;
		}
		//获取到头节点后的已完成删除的节点
		ListNode resNode = removeElements3(head.next,val);
		//再来处理头节点
		//如果头节点也满足条件，则头节点直接删除，直接返回已完成删除的后节点resnode
		//主要处理就是这里，先运行到尾节点，然后判断尾节点前一个节点是否满足条件，满足就直接连接上后续链表，不满足就再递归回去
		if (head.val==val) {
			return resNode;
		}
		//否则的话，头节点head就指向已删除完毕后的节点
		head.next = resNode;
		return head;
		
	}





	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		removeElements3(head,1);
		System.out.println(removeElements3(head,2));
	}
}