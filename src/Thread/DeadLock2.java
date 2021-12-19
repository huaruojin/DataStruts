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
 * @date 2021/6/620:19
 */
public class DeadLock2 implements Runnable {
	public int flag = 1;
	//静态对象是类的所有对象共享的
		private static Object o1 = new Object(), o2 = new Object();
	@Override
	public void run() {
		System.out.println("flag=" + flag);
		if (flag == 1) {
			synchronized (o1) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("1");
				}
			}
		}
		if (flag == 0) {
			synchronized (o2) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("0");
				}
			}
		}
	}

	public static void main(String[] args) {

		DeadLock2 td1 = new DeadLock2();
		DeadLock2 td2 = new DeadLock2();
		td1.flag = 1;
		td2.flag = 0;
		//td1,td2都处于可执行状态，但JVM线程调度先执行哪个线程是不确定的。
		//td2的run()可能在td1的run()之前运行
		new Thread(td1).start();
		new Thread(td2).start();

	}
}
