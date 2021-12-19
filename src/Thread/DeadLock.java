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
 * @date 2021/6/620:17
 */
public class DeadLock {
	public static String obj1 = "obj1";
	public static String obj2 = "obj2";


	public static void main(String[] args){
		Thread a = new Thread(new Lock1());
		Thread b = new Thread(new Lock2());
		a.start();
		b.start();
	}
}
class Lock1 implements Runnable{
	@Override
	public void run(){
		try{
			System.out.println("Lock1 running");
			while(true){
				synchronized(DeadLock.obj1){
					System.out.println("Lock1 lock obj1");
					Thread.sleep(3000);
					synchronized(DeadLock.obj2){
						System.out.println("Lock1 lock obj2");
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Lock2 implements Runnable{
	@Override
	public void run(){
		try{
			System.out.println("Lock2 running");
			while(true){
				synchronized(DeadLock.obj2){
					System.out.println("Lock2 lock obj2");
					Thread.sleep(3000);
					synchronized(DeadLock.obj1){
						System.out.println("Lock2 lock obj1");
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}