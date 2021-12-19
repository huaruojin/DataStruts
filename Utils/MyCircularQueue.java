/*
 * Copyright 2020 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

import java.util.Calendar;

/**
 * @author Administrator
 * @date 2020/8/3023:05
 */
class MyCircularQueue {

	private int[] data;
	private int size;
	private int front,tail;
	/** Initialize your data structure here. Set the size of the queue to be k. */
	public MyCircularQueue(int k) {
		data = new int[k+1];
		size = 0;
		front = 0;
		tail = 0;
	}

	/** Insert an element into the circular queue. Return true if the operation is successful. */
	public boolean enQueue(int value) {
		if (isFull()) {
			return false;
		}
		data[tail] = value;
		tail = (tail+1)%data.length;
		size++;
		return true;
	}

	/** Delete an element from the circular queue. Return true if the operation is successful. */
	public boolean deQueue() {
		if((isEmpty())) {
			return false;
		}
		data[front]= 0;
		front = (front+1)%data.length;
		size--;
		return true;
	}

	/** Get the front item from the queue. */
	public int Front() {
		if (isEmpty()){
			return -1;
		}
		return data[tail];
	}

	/** Get the last item from the queue. */
	public int Rear() {
		if(isEmpty()) {
			return -1;
		}
		if (tail!=0) {
			return data[(tail-1) % data.length];
		}
		return data[size];
	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		return front == tail;
	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		return (tail+1)%data.length == front;
	}

	private void resize(int capacity) {
		int[] newData =  new int[capacity+1];
		for (int i=0;i<size;i++){
			newData[i] = data[(i+front)%data.length];
		}
		data = newData;
		front = 0;
		tail = size;
	}


	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
		System.out.println(circularQueue.enQueue(1));
		System.out.println(circularQueue.enQueue(2));
		System.out.println(circularQueue.enQueue(3));
		System.out.println(circularQueue.enQueue(4));
		System.out.println(circularQueue.Rear());
		System.out.println(circularQueue.isFull());
		System.out.println(circularQueue.deQueue());
		System.out.println(circularQueue.enQueue(4));
		System.out.println(circularQueue.Rear());

		short s1 =1;
		s1 = (short) (s1+1);
	}
}



/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */