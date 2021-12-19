/*
 * Copyright 2020 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

/**
 * @author Administrator
 * @date 2020/8/3019:36
 */
public class LoopQueue<E> implements Queue<E>{

	private E[] data;
	private int front,tail;
	private int size;
	public LoopQueue(int capacity){
		//创建循环队列时会刻意的浪费一个空间，所以创建的时候为capacity+1；
		data = (E[]) new Object[capacity+1];
		front = 0;
		tail = 0;
		size = 0;
	}
	public LoopQueue(){
		this(10);
	}

	public int getCapacity() {
		//创建循环队列时会刻意的浪费一个空间，所以capacity为长度-1；
		return data.length-1;
	}
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return front==tail;
	}

	@Override
	public void enqueue(E e) {

		//tail+1 == front时循环队列满
		if ((tail + 1)%data.length==front) {
			resize(getCapacity()*2);
		}
		data[tail] = e;
		tail = (tail+1)%data.length;
		size++;
	}


	@Override
	public E dequeue() {
		if (isEmpty()) {
			throw new IllegalArgumentException("Cannot dequeue from an empty queue");
		}
		E ret = data[front];
		data[front] = null;
		front = (front+1)%data.length;
		size--;
		if (size == getCapacity()/4 &&getCapacity()/2 != 0) {
			resize(getCapacity()/2);
		}
		return ret;
	}

	@Override
	public E getFront() {
		if(isEmpty()) {
			throw new IllegalArgumentException("Queue is Empty");
		}
		return data[front];
	}

	private void resize(int capacity) {
		E[] newData = (E[]) new Object[capacity+1];
		for (int i=0;i<size;i++){
			//因为循环队列的front不一定是从0开始，所以有front的偏移。为了防止front+i越界。所以%data.length。
			newData[i] = data[(i+front)%data.length];
		}
		//此时已经将队列重置，所以front又从0开始了。此时tail=size
		data = newData;
		front = 0;
		tail = size;
	}
	@Override
	public String toString () {
		StringBuilder res = new StringBuilder();
		res.append(String.format("Queue: capacity = %d,size= %d\n",getCapacity(),size));
		res.append("front[");
		for(int i=front;i!=tail;i = (i+1)%data.length) {
			res.append(data[i]);
			if((i+1)%data.length!= tail) {
				res.append(", ");
			}
		}
		res.append("] tail");
		return res.toString();
	}
}