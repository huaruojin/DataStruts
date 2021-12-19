/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package singleton;

/**
 * @author Administrator
 * @date 2021/3/1523:46
 */
public class LazyMgr {
	private static LazyMgr INSTANCE;
	private LazyMgr(){};

	public static LazyMgr getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazyMgr();
		}
		return INSTANCE;
	}

}