/*
 * Copyright 2020 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/**
 * @author Administrator
 * @date 2020/8/2916:32
 */
public class Array<E> {
	private E[] data;
	private int capacity;
	private int size;

	public Array(int capacity) {
		data = (E[])new Object[capacity];
		size = 0;
	}
	public Array () {
		this(10);
	}
	public int getSize() {
		return size;
	}
	public int getCapacity() {
		return data.length;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void addLast(E e){
		this.add(size,e);
	}
	public void addFirst(E e){
		this.add(0,e);
	}
	public void add(int index,E e) {
		if(size == data.length) {
			resize(data.length*2);
		}
		if (index<0||index>size){
			throw new IllegalArgumentException("Add failed. Require index>=0 and index<size");
		}
		for(int i = size -1;i>=index;i--) {
			data[i+1] = data[i];
		}
		data[index] = e;
		size++;
	}
	public E remove(int index) {
		if(size == data.length/2) {
			resize(data.length/2);
		}
		if (index<0||index>=size){
			throw new IllegalArgumentException("Add failed. Require index>=0 and index<size");
		}
		E ret = data[index];
		for(int i = index+1;i<size;i++) {
			data[i-1] = data[i];
		}
		size--;
		data[size] = null;
		return ret;
	}
	/**
	 * 删除此元素
	 * */
	public boolean removeElement(E e) {
		int index = getIndex(e);
		if(index != -1) {
			if(remove(index)!=null) {
				return true;
			}
		}
		return false;
	}
	public E removeFirst() {
		return remove(0);
	}
	public E removeLast() {
		return remove(size-1);
	}
	void set(int index,E e){
		if (index<0||index>=size){
			throw new IllegalArgumentException("Set failed. Require index>=0 and index<size");
		}
		data[index] = e;
	}
	E get(int index) {
		if (index<0||index>=size){
			throw new IllegalArgumentException("Get failed. Require index>=0 and index<size");
		}
		return data[index];
	}
	public E getLast() {
		return get(size-1);
	}
	public E getFirst() {
		return get(0);
	}
	/**
	*如果没有此元素，返回-1
	*/
	public int getIndex(E e) {
		for(int i=0;i<size;i++) {
			if (data[i]==e){
				return i;
			}
		}
		return -1;
	}
	//线性算法
	public boolean contains(E e) {
		for(int i=0;i<size;i++) {
			if (data[i]==e){
				return true;
			}
		}
		return false;
	}
	/**
	*重新修改数组的容量
	*/
	public void resize(int newCapacity) {
		E[] newData = (E[])new Object[newCapacity];
		for (int i = 0;i<size;i++){
			newData[i] = data[i];
		}
		data = newData;
	}
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(String.format("Array: size= %d,capacity = %d\n",size,data.length));
		res.append('[');
		for(int i=0;i<size;i++) {
			res.append(data[i]);
			if(i != size-1) {
				res.append(", ");
			}
		}
		res.append(']');
		return res.toString();
	}
}