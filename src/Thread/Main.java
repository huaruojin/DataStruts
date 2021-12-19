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
 * @date 2021/5/1514:32
 */
public class Main {
	public static void main(String[] args) {
		/*SellThread st = new SellThread();
		Thread thread1 = new Thread(st,"窗口1");
		Thread thread2 = new Thread(st,"窗口2");
		Thread thread3 = new Thread(st,"窗口3");

		thread1.start();
		thread2.start();
		thread3.start();*/
		Runnable r1 = () ->{
			System.out.println("t1");
		};
		Thread t = new Thread(r1);
		t.start();
	}




}