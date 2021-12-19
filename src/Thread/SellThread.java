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
 * @date 2021/5/1514:29
 */
public class SellThread implements Runnable{
	private int tickets = 100;
	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//双重校验只能避免售卖负数及0票情况，不能解决线程安全
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "正在售第" + (tickets--) + "张票");
				}
			}
		}
	}
}