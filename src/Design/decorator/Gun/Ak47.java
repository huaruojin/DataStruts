/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package Gun;

/**
 * @author Administrator
 * @date 2021/7/1122:17
 */
public class Ak47  implements Gun{
	@Override
	public void aim() {
		System.out.println("Ak47瞄准");
	}

	@Override
	public void shoot() {
		System.out.println("Ak47射击");
	}

	@Override
	public void load() {
		System.out.println("Ak47装弹");
	}

	@Override
	public void unload() {
		System.out.println("Ak47下弹");
	}
}