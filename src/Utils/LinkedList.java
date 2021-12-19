package Utils;/*
 * Copyright 2020 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

/**
 * @author Administrator
 * @date 2020/9/123:55
 */
public class LinkedList<
		E> {
	private Node head;
	private int size;
	public LinkedList() {
		//初始化链表
		head = null;
		size = 0;
	}
	/*public LinkedList(E[] e) {
		for (int i = 0; i < e.length; i++) {
			if (i==0) {
				head = new Node(e[i]);
			}else {
				head = new Node(e[i],head.next);
			}
			size++;
		}
	}*/

	private class Node {

		private E e;
		private Node next;
		public Node(E e,Node next) {
			this.e = e;
			this.next = next;
		}
		public Node (E e) {
			this(e,null);
		}
		public Node() {
			this(null,null);
		}
		@Override
		public String toString() {
			return e.toString();
		}
	}

	public int getSize() {
		return  size;
	}
	public boolean isEmpty() {
		return size ==0;
	}
	public void addFirst(E e) {
		/*Node node = new Node();
		node.e = e;
		node.next = head;
		head = node;*/

		head = new Node(e,head);
		size++;
	}

	public void add(int index,E e) {

		if (index<0||index>size) {
			throw new IllegalArgumentException("Add Failed..., Illegal index");
		}
		if (index == 0) {
			addFirst(e);
		}else {
			Node prev = head;
			for (int i = 0; i < index-1; i++) {
				//直接指定到索引之前的节点
				prev = prev.next;
			}
			//已经取到前一个节点
			/*Node node = new Node(e);
			node.next = prev.next;
			prev.next = node;*/

			prev.next = new Node(e,prev.next);
			size++;
		}
	}

	public E delete(int index) {
		if (index<0||index>size) {
			throw new IllegalArgumentException("Add Failed..., Illegal index");
		}
		Node retNode = new Node();
		//从头节点开始找
		Node prev = head;
		if (index==0) {
			retNode = head;
			head = head.next;

			retNode.next = null;
		}else {
			//找到要删除之前的那个节点，prev  这时prev.next 就是这次要删除的节点
			for (int i = 0; i < index - 1; i++) {
				prev = prev.next;
			}
			//这时prev.next 就是这次要删除的节点
			retNode = prev.next;
			//然后，之前的节点直接跳过要删除的节点，指向下一个节点
			prev.next = retNode.next;
			//将要删除的节点的next指向null。将会被垃圾回收
			retNode.next = null;
		}
		size--;
		return retNode.e;

	}

	public E get (int index) {
		if (index<0||index>size) {
			throw new IllegalArgumentException("Add Failed..., Illegal index");
		}
		Node curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		return curr.e;
	}

	//在链表末尾添加元素
	public void addLast(E e){
		add(size,e);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Node cur = head; cur!=null ; cur = cur.next) {
			stringBuilder.append(cur+"->");
		}
		stringBuilder.append("null");
		return "Node:  "+stringBuilder.toString() +"  size: "+size;
	}

}