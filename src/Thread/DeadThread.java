/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Thread;

/**
 * @author Administrator
 * @date 2021/6/619:58
 */
public class DeadThread implements Runnable {

	public int flag = 1;
	public static  Object o1 =  "obj1";Object o2 = "obj2";;

	public DeadThread(int flag) {
		this.flag = flag;
	}

	public static void main(String[] args) {
		DeadThread deadThread = new DeadThread(1);
		DeadThread deadThread2 = new DeadThread(2);
		new Thread(deadThread).start();
		new Thread(deadThread2).start();
	}
	@Override
	public void run() {
		if (flag!=1) {
			synchronized (o1){
				try {
					System.out.println("-------lock1 lock o1");
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("-------lock1 lock o2");
				}
			}
		}
		if (flag==1) {
			synchronized (o2) {
				try {
					System.out.println("-------lock2 lock o2");
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("-------lock2 lock o1");
				}
			}
		}
	}
}
