/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Proxy;

/**
 * @author Administrator
 * @date 2021/7/2513:16
 */
public class Student implements People {


	@Override
	public void say() {
		System.out.println("我是个学生");
	}

	@Override
	public void run() {
		System.out.println("我跑向学校");
	}
}