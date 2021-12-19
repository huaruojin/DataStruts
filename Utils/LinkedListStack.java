/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

import Utils.LinkedList;

/**
 * @author Administrator
 * @date 2021/5/2423:33
 */
public class LinkedListStack<E> implements Stack<E> {

	private LinkedList<E> list;
	public  LinkedListStack(){
		list = new LinkedList<>();
	}

	@Override
	public int getSize() {
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void push(E e) {
		list.addFirst(e);
	}

	@Override
	public E pop() {
		return list.delete(0);
	}

	@Override
	public E peek() {
		return list.get(0);
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Stack: Top");
		res.append(list);
		return res.toString();
	}
}