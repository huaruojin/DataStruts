/*
 * Copyright 2020 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

/**
 * @author Administrator
 * @date 2020/8/300:08
 */
public interface Queue<E> {
	/**
	 * @return 获取队列大小
	 */
	int getSize();

	/**
	 * @return 判断队列是否为空
	 */
	boolean isEmpty();
	void enqueue(E e);
	E dequeue();
	E getFront();
}