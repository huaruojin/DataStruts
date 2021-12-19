/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package women;

import org.jetbrains.annotations.NotNull;

/**
 * @author Administrator
 * @date 2021/3/2421:59
 */
public class GoodWomen extends WrapperWomen{

	public GoodWomen(Women women) {
		super(women);
	}

	@Override
	public void say() {
		System.out.println("nmd");
		super.say();
		System.out.println("snmn");
	}
}