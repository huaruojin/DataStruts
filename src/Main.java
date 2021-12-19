/*
 * Copyright 2020 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

import Utils.LinkedList;

import java.util.Random;

/**
 * @author Administrator
 * @date 2020/8/2922:46
 */
public class Main {
	public static void main(String[] args) {
		//ArrayTest();
		//StackTest();
		/**括号匹配*/
		//BracketUtil b = new BracketUtil();
		//Solution so = new Solution();
		//System.out.println(b.isValid("}"));

		/*ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
		double arrayTime = queueTest(arrayQueue,1000);
		System.out.println(arrayTime);*/
		//LoopQueue<Integer> loopQueue = new LoopQueue<>();

		//double loopTime = queueTest(loopQueue,1000);
		//System.out.println(loopTime);

		/*Person person = new Person("adass",12);
		String name = person.name;
		person.setName("sadasdasdff");
		String name1 = person.getName();
		System.out.println("name--------"+name+"      name1------"+person.name);
		System.out.println(person.getName());
		File[] file = new File(".").listFiles(File::isHidden);
		System.out.println(file.toString());*/



		/*try {
			Class sc = Class.forName("src/Utils/Person.java");

			sc.getConstructor().newInstance();
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}*/
		nodeTest();
	}
	/**
	 *动态数组测试
	 * */
	public static void ArrayTest() {
		Array arr = new Array(20);
		for(int i=0;i<10;i++) {
			arr.addLast(i);
			System.out.println(arr.toString());
		}
		arr.removeFirst();
		arr.remove(3);
		System.out.println(arr.toString());
		System.out.println(arr.removeElement(6));
		arr.addLast(6);
		System.out.println(arr.removeElement(6));
		System.out.println(arr.removeLast());
	}
	/**
	 * 数组栈测试
	 * */
	public static void StackTest() {
		ArrayStack<Integer> stack = new ArrayStack<>();
		for(int i=0; i<5; i++) {
			stack.push(i);
			System.out.println(stack.toString());
		}
		for(int i=0; i<5; i++) {
			stack.pop();
			System.out.println(stack.toString());
		}
	}

	/**
	 * 队列测试
	 **/
	public static double queueTest(Queue<Integer> queue,int opCount) {
		long statrtTime = System.nanoTime();
		Random random = new Random();
		for (int i= 0;i<opCount;i++) {
			queue.enqueue(random.nextInt(Integer.MAX_VALUE));
		}
		/*for (int i= 0;i<opCount;i++) {
			queue.dequeue();
		}*/
		long endTime = System.nanoTime();

		return (endTime - statrtTime)/1000000000.0;
	}

	public static void nodeTest() {
		LinkedList linkedList  = new LinkedList();
		for (int i = 0; i < 10; i++) {
			linkedList.addFirst(i);

		}
		System.out.println(linkedList.toString());
		linkedList.add(0,1);
		System.out.println(linkedList.toString());
		System.out.println(linkedList.get(0));
		System.out.println(linkedList.get(1));
		System.out.println(linkedList.get(2));
		linkedList.delete(0);
		System.out.println(linkedList.toString());


	}
}