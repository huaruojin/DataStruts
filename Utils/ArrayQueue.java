/*
 * Copyright 2020 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

/**
 * @author Administrator
 * @date 2020/8/2920:47
 */
public class ArrayQueue<E> implements Queue<E> {
	private Array<E> queue;
	public ArrayQueue(int capacity) {
		queue = new Array<>(capacity);
	}
	public ArrayQueue() {
		queue = new Array<>();
	}
	@Override
	public int getSize() {
		return queue.getSize();
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public void enqueue(E e) {
		queue.addLast(e);
	}

	@Override
	public E dequeue() {
		return queue.removeFirst();
	}

	@Override
	public E getFront() {
		return queue.getFirst();
	}

	@Override
	public String toString () {
		StringBuilder res = new StringBuilder();
		res.append("Queue: ");
		res.append("front[");
		for(int i=0;i<queue.getSize();i++) {
			res.append(queue.get(i));
			if(i!= queue.getSize()-1) {
				res.append(", ");
			}
		}
		res.append("] tail");
		return res.toString();
	}
	public int getCapacity () {
		return queue.getCapacity();
	}
}